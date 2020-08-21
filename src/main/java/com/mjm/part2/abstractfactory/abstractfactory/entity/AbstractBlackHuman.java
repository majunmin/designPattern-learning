package com.mjm.part2.abstractfactory.abstractfactory.entity;

/**
 * @author majun
 * @date 2018/10/23 18:55
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("black man");
    }

    @Override
    public void talk() {
        System.out.println("black man talk");
    }
}
