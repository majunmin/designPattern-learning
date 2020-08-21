package com.mjm.part3.chain.level2;

/**
 * 父亲处理类 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 21:33
 * @since
 */
public class Father extends Handler {

    public Father(int level) {
        super(level);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
