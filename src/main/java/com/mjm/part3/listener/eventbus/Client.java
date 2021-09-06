package com.mjm.part3.listener.eventbus;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-09-06 11:33
 * @since
 */
public class Client {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new Hello());
        eventBus.register(new Hellow());
        // exepect out thrith
        eventBus.post(new Hellow());
        System.out.println("---------------");
        // exepect out twice
        eventBus.post(new Hello());
    }
}

class Hello {
    @Subscribe
    public void sayHello(Hello hello) {
        System.out.println("sayHello");
    }
}


class Hellow extends Hello {

    @Subscribe
    public void sayHellow(Hellow hello) {
        System.out.println("sayHellow");
    }
}