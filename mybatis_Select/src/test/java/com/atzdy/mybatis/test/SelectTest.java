package com.atzdy.mybatis.test;

import com.atzdy.mybatis.mapper.UserMapper;
import com.atzdy.mybatis.pojo.User;
import com.atzdy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/20 23:44
 * @Abstract：
 */
public class SelectTest {

    @Test
    public void getUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println("user = " + user);
    }

    @Test
    public void getUserByList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        userList.forEach(System.out::println);
    }

    @Test
    public void getCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int count = userMapper.getCount();
        System.out.println("count = " + count);
    }

    @Test
    public void getUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> user = userMapper.getUserToMap(1);
        System.out.println("user = " + user);
    }

    @Test
    public void getAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Object>> user = userMapper.getAllUserToMap();
        user.forEach(System.out::println);
    }

    @Test
    public void getAllUserToMapByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> user = userMapper.getAllUserToMapByParam();
        System.out.println("user = " + user);
    }
}
