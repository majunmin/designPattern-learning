package com.mjm.part3.proxy.common;

import com.mjm.part3.proxy.simple.IGamePlayer;

/**
 * Created by majunmin on 2018/11/11.
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    /**
     * 构造函数限制 谁能创建对象 并同时传递姓名
     * @param gamePlayer
     * @param name
     * @throws Exception
     */
    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if (gamePlayer == null){
            throw new Exception("cannoet create concret role!");
        }else{
            this.name = name;
        }
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
