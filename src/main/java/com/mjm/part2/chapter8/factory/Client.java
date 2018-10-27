package com.mjm.part2.chapter8.factory;

/**
 * @author majun
 * @date 2018/10/23 19:27
 */
public class Client {

    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
//        System.out.println(Human.class.getName());
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
