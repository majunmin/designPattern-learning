package com.mjm.part3.chapter12.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by majunmin on 2018/11/11.
 *
 *
 */
public class GamePlayerInvocationHandler implements InvocationHandler {

    // 被代理者
    Class clazz;

    //被代理对象
    Object object;

    //我要代理谁
    public GamePlayerInvocationHandler(Object object){
        this.object = object;
    }

    /**
     * 调用被代理的方法
     * 完成对真是方法的调用
     * 动态代理是根据被代理的接口所生成的所有的方法（给定一个接口，动态代理会宣称我已经实现了该接口下所有的方法了）
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(object, args);
        after();
        return result;
    }

    public void before(){
        // TODO: 2018/11/12  before function
    }

    public void after(){
        // TODO: 2018/11/12 after function
    }
}
