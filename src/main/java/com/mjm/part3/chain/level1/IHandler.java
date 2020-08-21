package com.mjm.part3.chain.level1;

/**
 * 有处理权的人员接口 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 21:12
 * @since
 */
public interface IHandler {

    // 处理一个女性（女儿、妻子或者母亲） 的 请示
    void handleMessage(IWomen iWomen);

}
