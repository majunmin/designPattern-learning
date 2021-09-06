package com.mjm.part3.listener.eventbus;

import java.util.concurrent.Executor;

/**
 * 异步事件总线 </br>
 * 异步非阻塞事件模型
 *
 * @author majunmin
 * @description
 * @datetime 2021-09-06 11:03
 * @since
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
