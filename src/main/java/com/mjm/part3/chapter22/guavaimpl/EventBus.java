package com.mjm.part3.chapter22.guavaimpl;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.Set;
import java.util.concurrent.Executor;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/4 12:38 上午
 * @since
 */
public class EventBus {

    private ObserverRegistry registry = new ObserverRegistry();
    private Executor executor;


    public EventBus() {
        this.executor = MoreExecutors.directExecutor();
    }

    public EventBus(Executor executor) {
        this.executor = executor;
    }

    public void register(Object object){
        registry.register(object);
    }

//    public void unRegister(Object object){
//        registry.unRegister(object);
//    }

    public void post(Object event){
        executor.execute(() ->{
            Set<ObserverAction> matchObservers = registry.getMatchObservers(event);
            matchObservers.forEach(observerAction -> observerAction.execute(event));
        });
    }
}
