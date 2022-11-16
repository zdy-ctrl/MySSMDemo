package com.atzdy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/19 22:10
 * @Abstract：
 */
@Controller
@RequestMapping("/test/view")
public class ViewTestController02 {

    @RequestMapping("/thymeleaf")
    public String testThymeleaf() {
        return "success";
    }

    @RequestMapping("/internal")
    public String testInternal() {
        return "forward:/success/ModelMap";
    }

    @RequestMapping("/Redirect")
    public String testRedirect() {
        return "redirect:/success/ModelMap";
    }
}
