package com.mjm.application.eventbus;

import lombok.Getter;

import java.lang.reflect.Method;

/**
 * 一句话功能简述 </br>
 * Subscriber 封装了对象实例和 被 {@link Subscribe}标记的方法,也就是说一个对象实例可以被封装为多个 Subscriber
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 13:23
 * @since
 */
@Getter
public class Subscriber {
    private final Object subscribeObject;
    private final Method subscribeMethod;

    private boolean disable;

    public Subscriber(Object ubscribeObject, Method subcribeMethod) {
        this.subscribeObject = ubscribeObject;
        this.subscribeMethod = subcribeMethod;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }
}
