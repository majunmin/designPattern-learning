package com.mjm.part3.chapter10.model3extends;

/**
 * isAlarm 是一个实现方法， 其作用是 模板方法根据其返回值
 * 决定是否响喇叭
 */
public abstract class HummerModel {
    public abstract void strat();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();

    /**
     * 模板方法一般都需要加上 final 防止被复写
     */
    public final void run(){
        this.strat();
        this.engineBoom();
        if (isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    /**
     * 钩子方法   控制汽车 是否 响喇叭
     * 默认响喇叭
     *
     *
     */
    protected Boolean isAlarm(){
        return true;
    }
}
