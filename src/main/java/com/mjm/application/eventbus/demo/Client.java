package com.mjm.application.eventbus.demo;


import com.mjm.application.eventbus.Bus;
import com.mjm.application.eventbus.EventBus;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 22:51
 * @since
 */
public class Client {

    public static void main(String[] args) {
        Bus bus = new EventBus();
        bus.register(new SimpleSubscribe1());

        bus.post("Hellow");
        bus.post("Hellow2", "testBus");

        bus.close();

    }
}
