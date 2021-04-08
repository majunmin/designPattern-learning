package com.mjm.part3.listener.thread;

/**
 * 暴露该接口给使用者 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 19:49
 * @since
 */
public interface Observable {

    // 生命周期枚举类型
    enum Cycle {
        START, RUNNING, DONE, ERROR
    }

    Cycle getCycle();

    // 定义线程启动方法,主要作用是为了屏蔽Thread 的其他方法
    void start();

    // 定义线程打断方法,主要作用是为了屏蔽Thread 的其他方法
    void interrupt();


}
