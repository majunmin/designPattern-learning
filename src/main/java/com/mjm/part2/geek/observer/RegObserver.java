package com.mjm.part2.geek.observer;

/**
 * 观察者接口 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-09-06 09:46
 * @since
 */
public interface RegObserver {

    /**
     * 注册成功回调
     *
     * @param userId
     */
    void handleRegSucess(long userId);
}
