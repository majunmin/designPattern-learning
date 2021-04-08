package com.mjm.application.eventbus;

import java.lang.reflect.Method;

/**
 * 一句话功能简述 </br>
 * <p>
 * EventContext 接口定义了 获取 消息源 消息体,以及该消息是由哪个 Subscriber 的 哪个 Subscribe 方法接收,
 * 主要用于推送消息出错时,被回调接口 EventExceptionHandler 使用
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 13:27
 * @since
 */
public interface EventContext {

    String getSource();

    Object getSubscriber();

    Method getSubscribe();

    Object getEvent();
}
