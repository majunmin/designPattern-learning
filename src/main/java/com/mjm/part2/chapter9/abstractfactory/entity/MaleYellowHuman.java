package com.mjm.part2.chapter9.abstractfactory.entity;

/**
 * @author majun
 * @date 2018/10/23 21:02
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("yellow male human!");
    }
}
