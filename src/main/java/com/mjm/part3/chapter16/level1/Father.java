package com.mjm.part3.chapter16.level1;

/**
 * 父亲处理女儿的请求 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 21:14
 * @since
 */
public class Father implements IHandler {
    //
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请示是："+ women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
