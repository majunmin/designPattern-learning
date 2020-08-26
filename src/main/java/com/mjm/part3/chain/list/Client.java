package com.mjm.part3.chain.list;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/26 5:51 下午
 * @since
 */
public class Client {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());

        handlerChain.handle();
    }
}
