package com.atzdy.mybatis.mapper;

import com.atzdy.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/20 3:28
 * @Abstract：
 */
public interface UserMapper {


    User getUserByUsername(String username);

    User getUserByNameAndPsw(String username, String password);

    User checkLoginByMap(Map<String, Object> map);

    void insertUser(User user);

    User getUserByParam(@Param("username") String username, @Param("password") String password);

}
