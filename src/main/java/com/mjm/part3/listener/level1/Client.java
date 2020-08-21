package com.mjm.part3.listener.level1;

import java.util.concurrent.TimeUnit;

/**
 * Created by majunmin on 2018/12/1.
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        HanFeiZi hanFeiZi = new HanFeiZi();
        LiSi liSi = new LiSi();

        Spy spyBreakFast = new Spy(hanFeiZi, liSi, "breakfast");
        spyBreakFast.start();

        Spy spyFun = new Spy(hanFeiZi, liSi, "fun");
        spyFun.start();

        TimeUnit.SECONDS.sleep(2);
        hanFeiZi.haveBreakfast();

        TimeUnit.SECONDS.sleep(2);
        hanFeiZi.haveFun();


    }
}
