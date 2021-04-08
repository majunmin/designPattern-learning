package com.mjm.application.future;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 14:56
 * @since
 */
public class FutureTask<T> implements Future<T> {

    private volatile boolean isDone;

    private T result;

    private final Object lock = new Object();

    /**
     * 阻塞获取结果
     *
     * @return
     */
    @Override
    public T get() throws InterruptedException {
        synchronized (lock) {
            // task is suspend when it's not finished
            // 这里用 while  而不是 if, 是因为  lock.wait() 可能被中断
            while (!isDone) {
                lock.wait();
            }
            return result;
        }
    }

    @Override
    public boolean isDone() {
        return isDone;
    }

    /**
     * 通知完成
     *
     * @param result
     */
    protected void finish(T result) {
        synchronized (lock) {
            if (isDone) {
                return;
            }
            this.result = result;
            this.isDone = true;
            lock.notifyAll();
        }
    }


}
