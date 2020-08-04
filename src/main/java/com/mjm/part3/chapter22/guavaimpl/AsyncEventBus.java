package com.mjm.part3.chapter22.guavaimpl;

import java.util.concurrent.Executor;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/4 9:07 上午
 * @since
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
