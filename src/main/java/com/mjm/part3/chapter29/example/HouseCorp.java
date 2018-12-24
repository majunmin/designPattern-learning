package com.mjm.part3.chapter29.example;

import com.mjm.part3.chapter29.example.entity.House;

/**
 * @author majunmin
 * @description
 * @datetime 2018-12-24 14:35
 */
public class HouseCorp extends Corp{
    HouseCorp(House house){
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("house corp making money ...");
    }
}
