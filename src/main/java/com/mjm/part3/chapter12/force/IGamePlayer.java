package com.mjm.part3.chapter12.force;

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

    /**
     * 每个人都可以找一下自己的代理
     * 指定要访问自己 必须通过某个代理
     * @return
     */
    IGamePlayer getProxy();

}
