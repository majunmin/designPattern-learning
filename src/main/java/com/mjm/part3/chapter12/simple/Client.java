package com.mjm.part3.chapter12.simple;

/**
 * Created by majunmin on 2018/11/11.
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("ssy");
        gamePlayer.login("ssy", "123456");
        gamePlayer.killBoss();
        gamePlayer.upGrade();

        /**
         * 代理
         */
        IGamePlayer gamePlayer1 = new GamePlayerProxy(gamePlayer);
        gamePlayer1.login("ssy", "123456");
        gamePlayer1.killBoss();
        gamePlayer1.upGrade();
    }
}
