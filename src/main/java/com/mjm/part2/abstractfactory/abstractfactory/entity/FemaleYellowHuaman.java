package com.mjm.part2.abstractfactory.abstractfactory.entity;

/**
 * @author majun
 * @date 2018/10/23 21:03
 */
public class FemaleYellowHuaman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("femail yellow human!");
    }
}
