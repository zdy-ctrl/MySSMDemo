package com.atzdy.spring.controller;

import com.atzdy.spring.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/15 22:22
 * @Abstract：
 */
@Controller
public class TestSharedData01 {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/testGetParam")
    public String showServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        System.out.println("username = " + username);
        String password = request.getParameter("password");
        System.out.println("password = " + password);
        return "success";
    }

    @RequestMapping("/testGetParamByFP")
    public String showFP(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "success";
    }

    @RequestMapping("/testParamByRequestParam")
    public String showGetParam(
            @RequestParam(value = "username", required = true, defaultValue = "张三") String username,
            @RequestParam(value = "password", required = true) String password
    ) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "success";
    }

    @RequestMapping("/testParamByPojo")
    public String showGetPOJO(User user) {
        System.out.println("user = " + user);
        return "success";
    }
}
