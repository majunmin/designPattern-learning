package com.mjm.part3.proxy.simple;

/**
 * Created by majunmin on 2018/11/11.
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    /**
     * 通过构造函数传递玩家姓名
     * @param name
     */
    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login(String name, String password) {
        System.out.println("登录名为" + name + "," + this.name + " login success!");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "kill Boss");
    }

    @Override
    public void upGrade() {
        System.out.println(this.name + "upGrade!");
    }
}
