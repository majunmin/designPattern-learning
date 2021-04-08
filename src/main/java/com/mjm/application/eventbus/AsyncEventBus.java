package com.mjm.application.eventbus;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 异步的 EventBus </br>
 * <p>
 * 用 {@link ThreadPoolExecutor} 替代 {@link Executor}
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 22:03
 * @since
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(String busName, EventExceptionHandler exceptionHandler, ThreadPoolExecutor executor) {
        super(busName, exceptionHandler, executor);
    }

    public AsyncEventBus(String busName, ThreadPoolExecutor executor) {
        super(busName, null, executor);
    }

    public AsyncEventBus(ThreadPoolExecutor executor) {
        super(DEFAULT_BUS_NAME, null, executor);
    }

    public AsyncEventBus(EventExceptionHandler exceptionHandler, ThreadPoolExecutor executor) {
        super(DEFAULT_BUS_NAME, exceptionHandler, executor);
    }
}
