package com.mjm.part3.proxy.force;


/**
 * Created by majunmin on 2018/11/11.
 */
public class GamePlayer implements IGamePlayer{

    private String name;

    private GamePlayerProxy proxy;

    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login(String name, String password) {
        if (this.proxy == null){
            System.out.println("必须制定代理角色");
        }else {
            System.out.println("登录名为" + name + "," + this.name + " login success!");
        }
    }

    @Override
    public void killBoss() {
        if (this.proxy == null){
            System.out.println("必须制定代理角色");
        }else {
            System.out.println(this.name + "kill Boss");
        }

    }

    @Override
    public void upGrade() {
        if (this.proxy == null){
            System.out.println("必须制定代理角色");
        }else {
            System.out.println(this.name + "upGrade!");
        }

    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }
}
