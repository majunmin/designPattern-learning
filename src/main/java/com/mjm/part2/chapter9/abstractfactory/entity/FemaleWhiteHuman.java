package com.mjm.part2.chapter9.abstractfactory.entity;

/**
 * @author majun
 * @date 2018/10/23 21:06
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("female white human!");
    }
}
