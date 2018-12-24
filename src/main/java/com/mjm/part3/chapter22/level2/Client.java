package com.mjm.part3.chapter22.level2;

/**
 * Created by majunmin on 2018/12/2.
 */
public class Client {

    public static void main(String[] args) {
        Observer lisi = new Lisi();
        Observer wangsi = new Wangsi();

        HanFeiZi hanFeiZi = new HanFeiZi();

        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);

        hanFeiZi.haveBreakfast();

        System.out.println("---====---");
        hanFeiZi.haveFun();
    }
}
