package com.atzdy.spring.dao.impl;

import com.atzdy.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/4 15:04
 * @Abstract：
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
