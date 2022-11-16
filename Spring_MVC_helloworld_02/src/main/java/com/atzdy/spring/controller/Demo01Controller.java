package com.atzdy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/13 21:14
 * @Abstract：
 */
@Controller
public class Demo01Controller {
    @RequestMapping("/success")
    public String showSuccess() {
        return "success";
    }

    @RequestMapping(
            value = "/table",
            method = RequestMethod.POST,
            params = "username"
    )
    public String showTable() {

        return "table";
    }
}
