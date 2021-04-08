package com.mjm.part3.listener.thread;

@FunctionalInterface
public interface Task<T> {

    // 任务执行接口
    T call();
}
