package com.mjm.part3.chain.level2;

/**
 * 女性接口 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 20:53
 * @since
 */
public interface IWomen {

    // 获取个人状况
    int getType();

    // 获得 个人指示 逛街？ 约会？ 看电影？
    String getRequest();
}
