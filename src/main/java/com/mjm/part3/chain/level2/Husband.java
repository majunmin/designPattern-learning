package com.mjm.part3.chain.level2;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 21:34
 * @since
 */
public class Husband extends Handler {

    public Husband(int level){
        super(level);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是:同意\n");
    }
}
