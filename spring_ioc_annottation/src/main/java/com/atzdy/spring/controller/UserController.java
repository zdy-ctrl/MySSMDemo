package com.atzdy.spring.controller;

import com.atzdy.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/4 15:02
 * @Abstract：
 */

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
