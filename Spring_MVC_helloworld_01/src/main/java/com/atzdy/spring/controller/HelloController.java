package com.atzdy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/11 21:52
 * @Abstract：
 */

@Controller
public class HelloController {
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/hello")
    public String showHello() {
        return "hello";
    }
}
