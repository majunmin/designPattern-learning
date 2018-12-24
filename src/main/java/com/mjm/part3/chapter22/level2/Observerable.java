package com.mjm.part3.chapter22.level2;


/**
 * Created by majunmin on 2018/12/2.
 *
 * 被观察者接口
 */
public interface Observerable {

    /**
     * 增加一个观察者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     * @param context
     */
    void notifyObservers(String context);
}
