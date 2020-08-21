package com.mjm.part3.listener.level2;

/**
 * Created by majunmin on 2018/12/2.
 */
public class Lisi implements Observer{

    @Override
    public void update(String context) {
        System.out.println("李斯： 观察到韩非子行动了，自己也开始行动");
        this.cry(context);
        System.out.println("李斯哭着报告");
    }

    public void cry(String context){
        System.out.println("李斯因为 韩非子 " + context + " cry");
    }
}
