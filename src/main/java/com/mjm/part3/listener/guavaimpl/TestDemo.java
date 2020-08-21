package com.mjm.part3.listener.guavaimpl;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/4 1:06 上午
 * @since
 */
public class TestDemo {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new Hello());
        eventBus.post("majm");
    }
}

class Hello{

    @Subscribe
    public void hello(String name){
        System.out.println("Hello!!!".concat(name));
    }
}
