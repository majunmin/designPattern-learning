package com.mjm.application.eventbus;

/**
 * 定义了 EventBus 所有使用的方法
 */
public interface Bus {

    /**
     * 将对象注册到 bus 上,该类就是 Subscriber了
     *
     * @param subscriber
     */
    void register(Object subscriber);

    /**
     * 将 某个对象从 bus中取消注册,之后就不会再接收到  来自 Bus的任何消息
     *
     * @param subscriber
     */
    void unregister(Object subscriber);

    /**
     * 提交 event到 默认 topic
     *
     * @param event
     */
    void post(Object event);

    /**
     * 提交 event 到 topic
     *
     * @param event
     * @param topic
     */
    void post(Object event, String topic);

    /**
     * 关闭 该 bus
     */
    void close();

    /**
     * 返回该 bus标志
     */
    String getBusName();

}
