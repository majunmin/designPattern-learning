package com.mjm.application.guardedsuspension;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * BlockingQueue </br>
 * array  lock
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 08:10
 * @since
 */
public class LockedBlockingQueue<T> {

    public static final int CAPACITY = 10;

    private Lock lock = new ReentrantLock();

    Condition notFull = lock.newCondition();
    Condition notEmpty = lock.newCondition();

    public T[] queue;

    private int count;
    private int takeIdx, putIdx;

    public LockedBlockingQueue() {
        this(CAPACITY);
    }

    public LockedBlockingQueue(int size) {
        this.queue = (T[]) new Object[size];
    }

    public void offer(T x) throws InterruptedException {
        lock.lock();
        try {
            while (count >= queue.length) {
                notFull.await();
            }

            queue[putIdx] = x;
            if (++putIdx == queue.length) {
                putIdx = 0;
            }
            count++;

            notEmpty.signal();

        } finally {
            lock.unlock();
        }
    }

    public T take() throws InterruptedException {
        T x = null;
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await();
            }

            x = queue[takeIdx];
            if (++takeIdx == queue.length) {
                takeIdx = 0;
            }
            count--;
            notFull.signal();
            return x;
        } finally {
            lock.unlock();
        }
    }
}
