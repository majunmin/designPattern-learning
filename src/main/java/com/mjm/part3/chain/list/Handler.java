package com.mjm.part3.chain.list;

import java.util.Objects;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/26 5:41 下午
 * @since
 */
public abstract class Handler {

    public Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(){
        boolean handled = doHandle();
        if (!handled && Objects.nonNull(next)){
            next.doHandle();
        }
    }



    public abstract boolean doHandle();
}
