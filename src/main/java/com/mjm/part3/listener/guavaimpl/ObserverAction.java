package com.mjm.part3.listener.guavaimpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/4 12:42 上午
 * @since
 */
public class ObserverAction {

    private Object target;
    private Method action;

    public ObserverAction(Object target, Method action) {
        this.target = target;
        this.action = action;
    }

    public void execute(Object event){
        try {
            action.invoke(target, event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
