package com.atzdy.spring.service.impl;

import com.atzdy.spring.dao.UserDao;
import com.atzdy.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/4 15:03
 * @Abstract：
 */
@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
