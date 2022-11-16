package com.atzdy.ssm.service;

import com.atzdy.ssm.pojo.User;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/2 23:30
 * @Abstract：
 */
public interface UserService {


    /**
     * 查询所有用户信息
     * */
    List<User> getAllUser();

    /**
     * 根据用户名来查询用户
     */
    User getUserByName(String username);

    /**
     * 注册用户
     */
    int setUser(String username, String password);

}
