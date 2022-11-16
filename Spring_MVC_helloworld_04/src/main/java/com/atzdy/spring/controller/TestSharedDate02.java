package com.atzdy.spring.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/15 23:49
 * @Abstract：
 */
@Controller
@RequestMapping("/test")
public class TestSharedDate02 {
    /*ServletAPI方式向request域对象共享数据*/
    @RequestMapping("/ServletAPI02")
    public String testServletAPI(HttpServletRequest request) {
        request.setAttribute("test", "hello,servletAPI");
        return "success";
    }

    /*ModelAndView方式向request域对象共享数据*/
    @RequestMapping("ByMAV")
    public ModelAndView testByMAV() {
        /**
         *ModelAndView有Model和View的功能
         *Model主要用于向请求域共享数据
         * View主要用于设置视图，实现页面跳转
         * */
        ModelAndView mav = new ModelAndView();
        //向请求域中共享数据
        mav.addObject("testMAV", "hello,ModelAndView");
        //设置视图，实现页面跳转
        mav.setViewName("success");
        return mav;
    }

    /*Model方式向request域对象中共享数据*/
    @RequestMapping("ByModel")
    public String testByModel(Model model) {
        model.addAttribute("testByModel", "hello,Model");
        return "success";
    }

    /*Map方式向request域对象中共享数据*/
    @RequestMapping("ByMap")
    public String testByModelMap(Map<String, Object> map) {
        map.put("testMap", "Hello,Map");
        return "success";
    }

    /*ModelMap方式向request域对象中共享数据*/
    @RequestMapping("ByModelMap")
    public String testByModelMap(ModelMap modelMap) {
        modelMap.addAttribute("testModelMap", "Hello,ModelMap");
        return "success";
    }

    /*向session域对象中共享数据*/
    @RequestMapping("BySession")
    public String testBySession(HttpSession httpSession) {
        httpSession.setAttribute("testSession", "Hello,Session");
        return "success";
    }

    /*向application域对象中共享数据*/
    @RequestMapping("ByApplication")
    public String testByApplication(HttpSession httpSession) {
        ServletContext application = httpSession.getServletContext();
        application.setAttribute("testApplication","Hello,Application");
        return "success";
    }
}
