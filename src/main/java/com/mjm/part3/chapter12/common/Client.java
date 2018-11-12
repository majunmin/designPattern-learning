package com.mjm.part3.chapter12.common;

import com.mjm.part3.chapter12.simple.IGamePlayer;

/**
 * Created by majunmin on 2018/11/11.
 */
public class Client {

    public static void main(String[] args) {
        /**
         * Client 只知道代理类，而不知道代理了谁，屏蔽了concrete Subject 对高层模块的影响
         * 适合对扩展性要求高的场景
         */
        IGamePlayer gamePlayer = new GamePalyerProxy("wp");
        gamePlayer.login("wp", "123456");
        gamePlayer.killBoss();
        gamePlayer.upGrade();
    }
}
