package com.atzdy.spring.service.impl;

import com.atzdy.spring.dao.UserDao;
import com.atzdy.spring.service.UserService;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/4 13:24
 * @Abstract：
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
