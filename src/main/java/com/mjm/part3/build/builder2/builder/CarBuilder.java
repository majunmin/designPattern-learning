package com.mjm.part3.build.builder2.builder;

import com.mjm.part3.build.builder2.model.CarModel;

import java.util.List;

/**
 * Created by majunmin on 2018/11/10.
 */
public abstract class CarBuilder {

    private List<String> sequence;

    public abstract void setSequence(List<String> sequence);

    public abstract CarModel getCarModel();
}
