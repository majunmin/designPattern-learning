package com.mjm.part3.listener.eventbus;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * 事件总线 </br>
 * 同步阻塞观察者模式
 *
 * @author majunmin
 * @description
 * @datetime 2021-09-06 10:49
 * @since
 */
public class EventBus {

    private Executor executor;
    private ObserverRegistry registry;

    public EventBus() {
        // MoreExecutors.directExecutor() 是 Google Guava 提供的工具类，看似是多线程，实际上是单线程
        // 之所以要这么实现，主要还是为了跟 AsyncEventBus 统一代码逻辑，做到代码复用
        this(MoreExecutors.directExecutor());
    }

    public EventBus(Executor executor) {
        this.executor = executor;
        this.registry = new ObserverRegistry();
    }

    /**
     * 观察者注册
     */
    public void register(Object object) {
        registry.register(object);
    }

    public void unregister(Object object) {

    }

    /**
     * 发送消息
     * post() 函数发送消息的时候,并非把消息发送给所有的观察者,而是发送给可匹配的观察者
     *
     * @param object
     */
    public void post(Object event) {
        List<ObserverAction> observerActions = registry.getMatchedObserverActions(event);
        observerActions.forEach(observerAction -> executor.execute(() -> observerAction.execute(event)));
    }


}
