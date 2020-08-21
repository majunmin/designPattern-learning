package com.mjm.part2.abstractfactory.abstractfactory;

import com.mjm.part2.abstractfactory.abstractfactory.entity.Human;

/**
 * @author majun
 * @date 2018/10/23 21:42
 */
public class Client {

    public static void main(String[] args) {
        HumanFactory humanFactory = new FemaleFactory();
        Human whiteHuman = humanFactory.createWhiteHuman();
        whiteHuman.getColor();
        whiteHuman.getSex();
        whiteHuman.talk();


    }
}
