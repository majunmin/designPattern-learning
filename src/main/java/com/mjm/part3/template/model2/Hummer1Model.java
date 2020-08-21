package com.mjm.part3.template.model2;

public class Hummer1Model extends HummerModel {
    @Override
    public void strat() {
        System.out.println("hummer1 start");
    }

    @Override
    public void stop() {
        System.out.println("hummer1 stop!");
    }

    @Override
    public void alarm() {
        System.out.println("hummer1 alarm!");
    }

    @Override
    public void engineBoom() {
        System.out.println("hummer1 Boom boom");
    }

}
