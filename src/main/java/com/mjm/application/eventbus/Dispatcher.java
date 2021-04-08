package com.mjm.application.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * Event 广播📢 </br>
 * <p>
 * Dispatcher 的主要作用是将 EventBus post 的 event 推送给每一个注册到 registry上的 subscriber
 * <p>
 * 具体的推送其实就是执行 被 {@link Subscribe}注解的方法
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 13:17
 * @since
 */
public class Dispatcher {

    private final Executor threadPool;
    private final EventExceptionHandler exceptionHandler;

    public static final Executor SEQ_EXECUTOR = SeqExecutorService.INSTANCE;
    public static final Executor PRE_EXECUTOR = PreThreadExecutorService.INSTANCE;

    private Dispatcher(Executor threadPool, EventExceptionHandler exceptionHandler) {
        this.threadPool = threadPool;
        this.exceptionHandler = exceptionHandler;
    }

    public void dispatch(Bus bus, Registry registry, Object event, String topic) {
        ConcurrentLinkedQueue<Subscriber> subscribers = registry.scanSubscriber(topic);
        if (subscribers == null) {
            if (exceptionHandler != null) {
                exceptionHandler.handle(new IllegalArgumentException("the topic " + topic + "not bind yet"),
                        new BaseEventContext(bus.getBusName(), null, event));
            }
        }

        subscribers.stream().filter(s -> !s.isDisable())
                .filter(s -> {
                    Method subscribeMethod = s.getSubscribeMethod();
                    Class<?> parameterType = subscribeMethod.getParameterTypes()[0];
                    return parameterType.isAssignableFrom(event.getClass());
                })
                .forEach(s -> {
                    realInvokeSubscribe(s, event, bus);
                });
    }

    private void realInvokeSubscribe(Subscriber subscriber, Object event, Bus bus) {
        Object subscribeObject = subscriber.getSubscribeObject();
        Method subscribeMethod = subscriber.getSubscribeMethod();

        threadPool.execute(() -> {
            try {
                subscribeMethod.invoke(subscribeObject, event);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
                if (Objects.nonNull(exceptionHandler)) {
                    exceptionHandler.handle(e, new BaseEventContext(bus.getBusName(), subscriber, event));
                }
            }
        });
    }

    public void close() {
        if (threadPool instanceof ExecutorService) {
            ((ExecutorService) threadPool).shutdown();
        }
    }

    public static Dispatcher newDispatcher(EventExceptionHandler exceptionHandler, Executor threadPool) {
        return new Dispatcher(threadPool, exceptionHandler);
    }

    public static Dispatcher seqDispatcher(EventExceptionHandler exceptionHandler) {
        return new Dispatcher(SEQ_EXECUTOR, exceptionHandler);
    }

    public static Dispatcher preDispatcher(EventExceptionHandler exceptionHandler) {
        return new Dispatcher(PRE_EXECUTOR, exceptionHandler);
    }

    /**
     * 每个线程负责一次消息推送 </br>
     *
     * @author majunmin
     * @description
     * @datetime 2021-04-07 14:07
     * @since
     */
    private static class PreThreadExecutorService implements Executor {

        public static final PreThreadExecutorService INSTANCE = new PreThreadExecutorService();

        @Override
        public void execute(Runnable command) {
            new Thread(command).start();
        }
    }

    /**
     * 顺序执行的 ExecutorService </br>
     *
     * @author majunmin
     * @description
     * @datetime 2021-04-07 14:05
     * @since
     */
    private static class SeqExecutorService implements Executor {

        public static final SeqExecutorService INSTANCE = new SeqExecutorService();

        private SeqExecutorService() {
        }

        @Override
        public void execute(Runnable command) {
            command.run();
        }
    }

    /**
     * EventContext 默认实现 </br>
     *
     * @author majunmin
     * @description
     * @datetime 2021-04-07 14:09
     * @since
     */
    private static class BaseEventContext implements EventContext {

        public final String eventBaseName;
        public final Subscriber subscriber;
        public final Object event;

        public BaseEventContext(String eventBaseName, Subscriber subscriber, Object event) {
            this.eventBaseName = eventBaseName;
            this.subscriber = subscriber;
            this.event = event;
        }

        @Override
        public String getSource() {
            return this.eventBaseName;
        }

        @Override
        public Object getSubscriber() {
            return Objects.nonNull(this.subscriber) ? subscriber.getSubscribeObject() : null;
        }

        @Override
        public Method getSubscribe() {
            return Objects.nonNull(this.subscriber) ? subscriber.getSubscribeMethod() : null;
        }

        @Override
        public Object getEvent() {
            return this.event;
        }
    }


}
