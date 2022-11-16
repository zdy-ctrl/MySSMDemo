package com.atzdy.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/2 21:51
 * @Abstract：
 */
@Controller
public class LoginController {
    @RequestMapping("/")
    public String loginShow() {
        return "login";
    }
}
