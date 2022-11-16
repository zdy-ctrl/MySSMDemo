package com.atzdy.spring.controller;

import com.atzdy.spring.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/15 13:58
 * @Abstract： 1.通过ServletAPI获取参数
 * 只需要在控制器方法的形参位置设置HttpServletRequest request类型的形参
 * 就可以在控制器方法中使用request对象获取请求参数
 */
@Controller
public class TestParamController {

    @RequestMapping("/testParam")
    public String testGetParam(HttpServletRequest request) {
        String username = request.getParameter("username");
        System.out.println("用户 = " + username);
        String password = request.getParameter("password");
        System.out.println("密码 = " + password);
        return "seccess";
    }

    @RequestMapping("/testParamByFP")
    public String testGetParamByFormalParam(@RequestParam(value = "username", required = true, defaultValue = "张三") String username, Integer password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "seccess";
    }

    @RequestMapping("/testParamByPojo")
    public String testParamByPojo(User user) {
        System.out.println(user);
        return "seccess";
    }
}
