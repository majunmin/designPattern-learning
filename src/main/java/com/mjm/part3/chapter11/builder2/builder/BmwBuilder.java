package com.mjm.part3.chapter11.builder2.builder;

import com.mjm.part3.chapter11.builder2.model.BmwCar;
import com.mjm.part3.chapter11.builder2.model.CarModel;

import java.util.List;

/**
 * Created by majunmin on 2018/11/10.
 */
public class BmwBuilder extends CarBuilder {

    private List<String> sequence;
    @Override
    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

    @Override
    public CarModel getCarModel() {
        BmwCar bmwCar = new BmwCar();
        bmwCar.setSequence(sequence);
        return bmwCar;
    }
}
