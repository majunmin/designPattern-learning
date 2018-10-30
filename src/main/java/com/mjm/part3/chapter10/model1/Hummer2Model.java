package com.mjm.part3.chapter10.model1;

import com.mjm.part3.chapter10.model1.HummerModel;

public class Hummer2Model extends HummerModel {
    @Override
    public void strat() {
        System.out.println("hummer2 start");
    }

    @Override
    public void stop() {
        System.out.println("hummer2 stop!");
    }

    @Override
    public void alarm() {
        System.out.println("humhummer2mer1 alarm!");
    }

    @Override
    public void engineBoom() {
        System.out.println("hummer2 Boom boom");
    }

    @Override
    public void run(){
        this.strat();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
