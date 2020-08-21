package com.mjm.part2.factory.factory;

/**
 * @author majun
 * @date 2018/10/23 18:55
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("black man");
    }

    @Override
    public void talk() {
        System.out.println("black man talk");
    }
}
