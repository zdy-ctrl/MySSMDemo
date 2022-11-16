package com.atzdy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/15 14:02
 * @Abstract：
 */
@Controller
public class PortalController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }
}
