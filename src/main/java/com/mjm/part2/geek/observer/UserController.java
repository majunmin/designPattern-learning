package com.mjm.part2.geek.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户接口 </br>
 *
 * @author majunmin
 * @description
 * @Datetime 2021-09-06 09:47
 * @since
 */
public class UserController {

    private UserService userService;
    private List<RegObserver> regObservers = new ArrayList<>();

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setRegObservers(List<RegObserver> regObservers) {
        this.regObservers = regObservers;
    }

    public void register(String telephone, String password) {
        // check valid

        long userId = userService.register(telephone, password);
        for (RegObserver observer : regObservers) {
            observer.handleRegSucess(userId);
        }

    }
}
