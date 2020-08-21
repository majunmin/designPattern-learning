package com.mjm.part3.chain.level1;

/**
 * 丈夫处理妻子的请示 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 21:15
 * @since
 */
public class Husband implements IHandler {

    @Override
    public void handleMessage(IWomen women) {
        System.out.println("妻子的请示是：" + women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
