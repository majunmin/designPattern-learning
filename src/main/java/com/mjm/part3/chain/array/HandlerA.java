package com.mjm.part3.chain.array;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/26 5:48 下午
 * @since
 */
public class HandlerA extends Handler {

    @Override
    public boolean handle() {
        System.out.println("handlerA handle ...");
        return false;
    }
}
