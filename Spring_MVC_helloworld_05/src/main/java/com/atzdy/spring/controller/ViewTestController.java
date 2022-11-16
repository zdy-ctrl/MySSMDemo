package com.atzdy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/17 20:07
 * @Abstract：
 */
@Controller
@RequestMapping("/success")
public class ViewTestController {

    @RequestMapping("/MAV")
    public ModelAndView testMAV() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testMAV", "测试成功！");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/Model")
    public String testModel(Model model) {
        model.addAttribute("testModel", "Model测试成功");
        return "success";
    }

    @RequestMapping("/Map")
    public String testMap(Map<String,Object> map) {
        map.put("testMap", "Map测试成功");
        return "success";
    }

    @RequestMapping("/ModelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("testModelMap", "ModelMap测试成功！");
        return "success";
    }
}
