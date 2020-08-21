package com.mjm.part3.proxy.common;

import com.mjm.part3.proxy.simple.IGamePlayer;

/**
 * Created by majunmin on 2018/11/11.
 */
public class GamePalyerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    /**
     * 通过构造函数传递 对谁代理
     * @param name
     */
    public GamePalyerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            // TODO: 2018/11/11
        }
    }

    @Override
    public void login(String name, String password) {
        this.gamePlayer.login(name, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upGrade() {
        this.gamePlayer.upGrade();
    }
}
