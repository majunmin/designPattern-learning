package com.mjm.part2.chapter9.abstractfactory.entity;

/**
 * @author majun
 * @date 2018/10/23 21:05
 */
public class MaleWhiteHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("male white human!");
    }
}
