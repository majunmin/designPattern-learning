package com.mjm.part3.chapter12.simple;

/**
 * Created by majunmin on 2018/11/11.
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    /**
     * 通过构造函数传入  需要对谁进行代理
     *
     * @param gamePlayer
     */
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    /**
     * 代练登录
     * @param name
     * @param password
     */
    @Override
    public void login(String name, String password) {
        this.gamePlayer.login(name, password);
    }

    /**
     * 代练杀怪
     */
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    /**
     * 代练升级
     */
    @Override
    public void upGrade() {
        this.gamePlayer.upGrade();
    }
}
