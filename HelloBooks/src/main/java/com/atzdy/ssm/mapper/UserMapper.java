package com.atzdy.ssm.mapper;

import com.atzdy.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/2 23:46
 * @Abstract：
 */

public interface UserMapper {
    /**
     * 根据用户名和密码查询用户
     */
    User getUserByNameAndPassword(@Param("username") String username, @Param("password") Integer password);

    /**
     * 查询所有用户信息
     */
    List<User> getUserList();

    /**
     * 根据用户名查询用户
     */
    User getUserByName(@Param("username") String username );

    /**
     * 注册用户
     */
    int setUser(@Param("username") String username, @Param("password") String password);

}
