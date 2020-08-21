package com.mjm.part3.chain.level1;


/**
 * 儿子处理母亲的请求 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 21:16
 * @since
 */
public class Son implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请示是：" + women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
