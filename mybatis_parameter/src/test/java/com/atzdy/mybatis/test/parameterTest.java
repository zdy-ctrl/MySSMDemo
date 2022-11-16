package com.atzdy.mybatis.test;

import com.atzdy.mybatis.mapper.UserMapper;
import com.atzdy.mybatis.pojo.User;
import com.atzdy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/20 3:56
 * @Abstract：
 */
public class parameterTest {
    @Test
    public void getUserByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserByUsername("admin00");
        System.out.println("user = " + user);
    }

    @Test
    public void getUserByNameAndPsw() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserByNameAndPsw("admin00","123");
        System.out.println("user = " + user);
    }

    @Test
    public void checkLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "admin00");
        map.put("password", "123");
        User user = userMapper.checkLoginByMap(map);
        System.out.println("user = " + user);
    }

    @Test
    public void getInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "root", "123456", 33, "男", "12345@qq.com");
        userMapper.insertUser(user);
        System.out.println("user = " + user);
    }

    @Test
    public void getUserByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserByParam("admin00","123");
        System.out.println("user = " + user);
    }
}
