package com.mjm.part3.listener.thread;

/**
 * 定义生命周期的回调方法 </br>
 * 监听者
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 19:52
 * @since
 */
public interface TaskLifeCycle<T> {

    void onStart(Thread t);

    void onRunning(Thread t);

    /**
     * @param t      当前线程
     * @param result 执行结果
     */
    void onDone(Thread t, T result);

    void onError(Thread t, Exception ex);
}
