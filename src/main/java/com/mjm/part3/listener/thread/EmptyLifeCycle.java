package com.mjm.part3.listener.thread;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 19:55
 * @since
 */
public class EmptyLifeCycle<T> implements TaskLifeCycle<T> {
    @Override
    public void onStart(Thread t) {
        // TODO: empty implementation
    }

    @Override
    public void onRunning(Thread t) {
        // TODO: empty implementation
    }

    @Override
    public void onDone(Thread t, T result) {
        // TODO: empty implementation
    }

    @Override
    public void onError(Thread t, Exception ex) {
        // TODO: empty implementation
    }
}
