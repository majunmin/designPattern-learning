package com.mjm.part3.chapter12.dynamic;


import com.mjm.part3.chapter12.simple.GamePlayer;
import com.mjm.part3.chapter12.simple.IGamePlayer;

import java.lang.reflect.Proxy;

/**
 * Created by majunmin on 2018/11/12.
 *
 * java中动态代理主要有JDK和CGLIB两种方式。
 *
 * 区别主要是jdk是代理接口，而cglib是代理类。
 *
 * jdk的动态代理调用了Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) 方法。
 *
 *      通过该方法生成字节码，动态的创建了一个代理类，
 *      interfaces参数是该动态类所继承的所有接口，
 *      而继承InvocationHandler 接口的类则是实现在调用代理接口方法前后的具体逻辑
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("zhangsan");
        GamePlayerInvocationHandler gamePlayerInvocationHandler = new GamePlayerInvocationHandler(gamePlayer);

        /**
         * newProxyInstance方法执行了以下几种操作。
         *
         * 1.生成一个实现了参数interfaces里所有接口且继承了Proxy的代理类的字节码，然后用参数里的classLoader加载这个代理类。
         *
         * 2.使用代理类父类的构造函数 Proxy(InvocationHandler h)来创造一个代理类的实例，将我们自定义的InvocationHandler的子类传入。
         *
         * 3.返回这个代理类实例。
         *
         *    在main方法中加入System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true")，
         *    这样就会把生成的代理类Class文件保存在本地磁盘上，然后再反编译可以得到代理类的源码：
         */
        IGamePlayer gamePlayerProxy = (IGamePlayer)Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(),
                gamePlayer.getClass().getInterfaces(),
                gamePlayerInvocationHandler);

        gamePlayerProxy.login("zz", "aapwd");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upGrade();

    }
}
