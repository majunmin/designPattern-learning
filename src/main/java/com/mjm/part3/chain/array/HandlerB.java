package com.mjm.part3.chain.array;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/26 5:49 下午
 * @since
 */
public class HandlerB extends Handler {

    @Override
    public boolean handle() {
        System.out.println("handlerB handle ...");
        return false;
    }
}
