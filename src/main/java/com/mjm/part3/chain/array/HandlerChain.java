package com.mjm.part3.chain.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 记录了 链头 和 链尾  的链表
 *
 * 记录链尾是为了 更容易的添加 handler
 *
 * @author majunmin
 * @description
 * @datetime 2020/8/26 5:42 下午
 * @since
 */
public class HandlerChain {

    private List<Handler> handlerList;

    public HandlerChain(){
        this.handlerList = new ArrayList<>();
    }

    public void addHandler(Handler handler) {
        handlerList.add(handler);
    }

    public void handle() {
        for (Handler handler : handlerList) {
            boolean handled = handler.handle();
            if (handled){
                break;
            }
        }
    }

}
