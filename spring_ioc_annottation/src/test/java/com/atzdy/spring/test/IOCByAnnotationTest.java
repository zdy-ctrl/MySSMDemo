package com.atzdy.spring.test;

import com.atzdy.spring.controller.UserController;
import com.atzdy.spring.dao.UserDao;
import com.atzdy.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/4 15:06
 * @Abstract：
 */
public class IOCByAnnotationTest {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        /* UserController userController = ioc.getBean(UserController.class);
        System.out.println("userController = " + userController);*/
        UserService userService = ioc.getBean(UserService.class);
        System.out.println("userService = " + userService);
        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println("userDao = " + userDao);
    }
}
