package com.mjm.part2.chapter8.factory;

/**
 * @author majun
 * @date 2018/10/23 18:55
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("yellow man");
    }

    @Override
    public void talk() {
        System.out.println("yellow man talk");
    }
}
