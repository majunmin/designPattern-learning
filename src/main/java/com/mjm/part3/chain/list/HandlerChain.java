package com.mjm.part3.chain.list;

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

    private Handler head;
    private Handler tail;

    public void addHandler(Handler handler) {
        if (Objects.isNull(head)) {
            head = tail = handler;
        } else {
            tail.setNext(handler);
        }
    }

    public void handle() {
        if (Objects.nonNull(head)) {
            head.handle();
        }
    }

}
