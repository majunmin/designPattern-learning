package com.mjm.part3.build.builder3.builder;

import com.mjm.part3.build.builder3.model.BenzCar;
import com.mjm.part3.build.builder3.model.CarModel;

import java.util.List;

/**
 * Created by majunmin on 2018/11/10.
 */
public class BenzBuilder extends CarBuilder {

    private List<String> sequence ;
    @Override
    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

    @Override
    public CarModel getCarModel() {
        BenzCar benzCar = new BenzCar();
        benzCar.setSequence(sequence);
        return benzCar;
    }
}
