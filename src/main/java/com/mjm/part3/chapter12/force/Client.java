package com.mjm.part3.chapter12.force;

/**
 * Created by majunmin on 2018/11/11.
 */
public class Client {

    public static void main(String[] args) {
        //no
        IGamePlayer gamePlayer = new GamePlayer("kaka");
        gamePlayer.login("ssy","123456");

        //no
        IGamePlayer gamePlayerP = new GamePlayerProxy(gamePlayer);
        gamePlayerP.login("ssy","123456");
        gamePlayerP.killBoss();
        gamePlayerP.upGrade();

        //yes  代理为 kaka  被代理的是 kak
        IGamePlayer gamePlayer2 = gamePlayer.getProxy();
        gamePlayer2.login("kak", "1234");
    }
}
