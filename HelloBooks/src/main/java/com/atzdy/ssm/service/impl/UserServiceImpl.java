package com.atzdy.ssm.service.impl;

import com.atzdy.ssm.mapper.UserMapper;
import com.atzdy.ssm.pojo.User;
import com.atzdy.ssm.service.UserService;
import com.atzdy.ssm.utils.MD5CryptUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.Md5Crypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/2 23:31
 * @Abstract：
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getUserList();
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public int setUser(String username, String password) {
        String pswMd5 = Md5Crypt.md5Crypt(password.getBytes());
        return userMapper.setUser(username,pswMd5);
    }

}
