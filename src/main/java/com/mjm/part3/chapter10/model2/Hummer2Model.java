package com.mjm.part3.chapter10.model2;

import com.mjm.part3.chapter10.model2.HummerModel;

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
}
