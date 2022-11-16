package com.atzdy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/13 20:32
 * @Abstract：
 */

@Controller
public class DemoController {
    @RequestMapping(value = "/")
    public String showIndex() {
        return "index";
    }
}
