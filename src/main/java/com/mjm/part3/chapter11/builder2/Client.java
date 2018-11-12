package com.mjm.part3.chapter11.builder2;

import com.mjm.part3.chapter11.builder2.builder.BmwBuilder;
import com.mjm.part3.chapter11.builder2.builder.CarBuilder;
import com.mjm.part3.chapter11.builder2.model.BmwCar;

import java.util.Arrays;

/**
 * Created by majunmin on 2018/11/10.
 */
public class Client {

    public static void main(String[] args) {
        CarBuilder carBuilder = new BmwBuilder();
        carBuilder.setSequence(Arrays.asList("start", "alarm"));
        BmwCar carModel = (BmwCar)carBuilder.getCarModel();
        carModel.run();
    }
}

