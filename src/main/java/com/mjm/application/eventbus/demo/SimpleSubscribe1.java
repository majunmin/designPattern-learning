package com.mjm.application.eventbus.demo;


import com.mjm.application.eventbus.Subscribe;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 22:50
 * @since
 */
public class SimpleSubscribe1 {

    @Subscribe
    public void method1(String message) {
        System.out.println("SimpleSubscribe1 == method1 ==" + message);
    }

    @Subscribe(topic = "testBus")
    public void method2(String message) {
        System.out.println("SimpleSubscribe1 == method2 ==" + message);
    }
}
