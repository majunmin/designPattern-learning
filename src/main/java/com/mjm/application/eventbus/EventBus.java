package com.mjm.application.eventbus;


import java.util.concurrent.Executor;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 13:10
 * @since
 */
public class EventBus implements Bus {

    // 用于维护 Subscribber 注册表
    private final Registry registry = new Registry();

    private String busName;

    public static final String DEFAULT_BUS_NAME = "default";

    public static final String DEFAULT_TOPIC = "default-topic";

    private final Dispatcher dispatcher;

    public EventBus() {
        this(DEFAULT_BUS_NAME, null, Dispatcher.SEQ_EXECUTOR);
    }

    public EventBus(String busName) {
        this(busName, null, Dispatcher.SEQ_EXECUTOR);
    }

    public EventBus(String busName, EventExceptionHandler exceptionHandler, Executor executor) {
        this.busName = busName;
        this.dispatcher = Dispatcher.newDispatcher(exceptionHandler, executor);
    }

    /**
     * 将注册的动作委托给  Registry
     *
     * @param subscriberObj
     */
    @Override
    public void register(Object subscriberObj) {
        this.registry.bind(subscriberObj);
    }

    /**
     * 解除注册的动作 同样委托给  Registry
     *
     * @param subscriberObj
     */
    @Override
    public void unregister(Object subscriberObj) {
        this.registry.unbind(subscriberObj);
    }

    @Override
    public void post(Object event) {
        this.post(event, DEFAULT_TOPIC);
    }

    /**
     * 将 event 提交到指定的 topic, 具体的动作有  Dispatcher 完成
     *
     * @param event
     * @param topic
     */
    @Override
    public void post(Object event, String topic) {
        dispatcher.dispatch(this, this.registry, event, topic);
    }

    /**
     * 关闭销毁 bus
     */
    @Override
    public void close() {
        dispatcher.close();
    }

    /**
     * 返回 busName
     *
     * @return
     */
    @Override
    public String getBusName() {
        return this.busName;
    }
}
