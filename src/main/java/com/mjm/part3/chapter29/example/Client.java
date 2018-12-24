package com.mjm.part3.chapter29.example;

import com.mjm.part3.chapter29.example.entity.Cloth;
import com.mjm.part3.chapter29.example.entity.House;
import com.mjm.part3.chapter29.example.entity.IPod;

/**
 * @author majunmin
 * @description
 * @datetime 2018-12-24 14:55
 */
public class Client {

    public static void main(String[] args) {
        House house = new House();
        Cloth cloth = new Cloth();
        Corp houseCorp = new HouseCorp(house);
        Corp clothCorp = new ClothCorp(cloth);

        houseCorp.makeMoney();
        clothCorp.makeMoney();

        Corp shanzhaiCorp = new ShanZhaiCorp(new IPod());
        shanzhaiCorp.makeMoney();


    }
}
