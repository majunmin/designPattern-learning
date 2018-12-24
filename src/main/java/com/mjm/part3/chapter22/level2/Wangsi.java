package com.mjm.part3.chapter22.level2;

/**
 * Created by majunmin on 2018/12/2.
 */
public class Wangsi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("王思： 观察到韩非子行动了，自己也开始行动");
        this.happy(context);
        System.out.println("王思笑着报告");
    }

    public void happy(String context){
        System.out.println("王思因为 韩非子 " + context + " cry");
    }
}
