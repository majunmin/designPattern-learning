package com.mjm.part3.chain.level2;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 21:35
 * @since
 */
public class Son extends Handler {
    public Son(int level) {
        super(level);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是:同意\n");
    }
}
