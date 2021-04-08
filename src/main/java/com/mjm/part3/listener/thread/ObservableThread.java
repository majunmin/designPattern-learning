package com.mjm.part3.listener.thread;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 19:58
 * @since
 */
public class ObservableThread<T> extends Thread implements Observable {

    private TaskLifeCycle<T> lifeCycle;

    private Task<T> task;

    private Cycle cycle;

    public ObservableThread(Task<T> task) {
        this(task, new EmptyLifeCycle<>());
    }

    public ObservableThread(Task<T> task, TaskLifeCycle<T> lifeCycle) {
        if (task == null) {
            throw new IllegalArgumentException();
        }
        this.lifeCycle = lifeCycle;
        this.task = task;
    }

    private void update(Cycle cycle, T result, Exception ex) {
        this.cycle = cycle;
        if (lifeCycle == null) {
            return;
        }

        try {
            switch (cycle) {
                case START:
                    this.lifeCycle.onStart(Thread.currentThread());
                    break;
                case RUNNING:
                    this.lifeCycle.onRunning(Thread.currentThread());
                    break;
                case DONE:
                    this.lifeCycle.onDone(Thread.currentThread(), result);
                    break;
                case ERROR:
                    this.lifeCycle.onError(Thread.currentThread(), ex);
                    break;
            }
        } catch (Exception exception) {
            if (cycle == Cycle.ERROR) {
                throw exception;
            }
        }
    }

    @Override
    public Cycle getCycle() {
        return this.cycle;
    }

    @Override
    public void interrupt() {

    }


    /**
     * 执行逻辑单元的时候 触发相应的事件
     * 定义为 final 类型,禁止子类覆写,模板模式
     */
    @Override
    public final void run() {
        this.update(Cycle.START, null, null);
        T result = null;
        try {
            this.update(Cycle.RUNNING, null, null);
            result = this.task.call();
            this.update(Cycle.DONE, result, null);
        } catch (Exception exception) {
            this.update(Cycle.ERROR, result, exception);
        }
    }
}
