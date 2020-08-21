package com.mjm.part2.abstractfactory.abstractfactory.entity;

/**
 * @author majun
 * @date 2018/10/23 21:04
 */
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("male black human!");
    }
}
