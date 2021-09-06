package com.mjm.part2.geek.observer;

/**
 * UserService </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-09-06 09:50
 * @since
 */
public interface UserService {
    /**
     * 注解接口
     *
     * @param telephone
     * @param password
     * @return
     */
    long register(String telephone, String password);
}
