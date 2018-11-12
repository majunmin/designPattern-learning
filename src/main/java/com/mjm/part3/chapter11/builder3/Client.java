package com.mjm.part3.chapter11.builder3;

import com.mjm.part3.chapter11.builder3.builder.BmwBuilder;
import com.mjm.part3.chapter11.builder3.builder.CarBuilder;
import com.mjm.part3.chapter11.builder3.model.BenzCar;
import com.mjm.part3.chapter11.builder3.model.BmwCar;
import com.mjm.part3.chapter11.builder3.model.CarModel;

import java.util.Arrays;

/**
 * Created by majunmin on 2018/11/10.
 */
public class Client {

    public static void main(String[] args) {
        Director direct = new Director();
        BenzCar benzCarA = direct.getBenzCarA();
        BmwCar bmwCarA = direct.getBmwCarA();
        BenzCar benzCarB = direct.getBenzCarB();
        BmwCar bmwCarB = direct.getBmwCarB();

        Arrays.asList(benzCarA,bmwCarA, benzCarB, bmwCarB)
                .forEach(CarModel::run);
    }
}

