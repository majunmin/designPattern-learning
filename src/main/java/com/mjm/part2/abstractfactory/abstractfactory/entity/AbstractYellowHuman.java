package com.mjm.part2.abstractfactory.abstractfactory.entity;

/**
 * @author majun
 * @date 2018/10/23 18:55
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("yellow man");
    }

    @Override
    public void talk() {
        System.out.println("yellow man talk");
    }
}
