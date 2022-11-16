package com.atzdy.spring.controller;

import com.atzdy.spring.service.UserService;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/4 13:21
 * @Abstract：
 */
public class UserController {

    private UserService userService = null;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
