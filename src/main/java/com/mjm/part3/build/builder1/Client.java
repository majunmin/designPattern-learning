package com.mjm.part3.build.builder1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by majunmin on 2018/11/10.
 */
public class Client {

    public static void main(String[] args) {
        List<String> sequence = Arrays.asList("start", "alarm", "engineBoom",  "stop");
        CarModel carModel = new BmwCar();
        carModel.setSequence(sequence);
        carModel.run();
    }
}
