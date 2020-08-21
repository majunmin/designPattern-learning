package com.mjm.part3.build.builder1;

/**
 * Created by majunmin on 2018/11/10.
 */
public class BenzCar extends CarModel{
    @Override
    protected void start() {
        System.out.println("benz start ...");
    }

    @Override
    protected void stop() {
        System.out.println("benz stop ...");
    }

    @Override
    protected void alarm() {
        System.out.println("benz alarm ...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("benz engineBoom ...");
    }
}
