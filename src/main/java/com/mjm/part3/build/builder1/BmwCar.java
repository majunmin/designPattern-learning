package com.mjm.part3.build.builder1;

/**
 * Created by majunmin on 2018/11/10.
 */
public class BmwCar extends CarModel {
    @Override
    protected void start() {
        System.out.println("bmw start ... ");
    }

    @Override
    protected void stop() {
        System.out.println("bmw stop ... ");
    }

    @Override
    protected void alarm() {
        System.out.println("bmw alarm ...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("bmw engineBoom ... ");
    }
}
