package com.mjm.part3.chapter10.model2;

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
        this.alarm();
        this.stop();
    }
}
