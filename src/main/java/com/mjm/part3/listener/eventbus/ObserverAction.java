package com.mjm.part3.listener.eventbus;

import lombok.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ObserverAction  </br>
 * 用来表示{@link com.mjm.application.eventbus.Subscribe} 标记的方法,
 * target 观察者类,  method： 观察者方法
 *
 * @author majunmin
 * @description
 * @datetime 2021-09-06 10:53
 * @since
 */
@Data
public class ObserverAction {

    private Object target;
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    public void execute(Object event) { // event 是method 的参数
        try {
            method.invoke(target, event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
