package com.mjm.part3.chapter12.simple;

/**
 * Created by majunmin on 2018/11/11.
 */
public interface IGamePlayer {
    /**
     * 登录
     */
    void login(String name, String password);

    /**
     * 杀怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upGrade();

}
