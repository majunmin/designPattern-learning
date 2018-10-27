package com.mjm.part2.chapter9.abstractfactory.entity;

/**
 * @author majun
 * @date 2018/10/23 18:56
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("white man");
    }

    @Override
    public void talk() {
        System.out.println("white man talk");
    }
}
