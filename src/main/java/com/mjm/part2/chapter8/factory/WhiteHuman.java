package com.mjm.part2.chapter8.factory;

/**
 * @author majun
 * @date 2018/10/23 18:56
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("white man");
    }

    @Override
    public void talk() {
        System.out.println("white man talk");
    }
}
