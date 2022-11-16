package com.atzdy.mybatis.test;

import com.atzdy.mybatis.mapper.SpecialSQLMapper;
import com.atzdy.mybatis.pojo.User;
import com.atzdy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/21 23:06
 * @Abstract：
 */
public class SpecialSQLTest {

    @Test
    public void getUserByFuzzy() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> users = mapper.testFuzzy("1");
        System.out.println(users);
    }

    @Test
    public void DeleteByIds() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        int i = mapper.deleteMore("4,5");
        System.out.println("i = " + i);
    }

    @Test
    public void getAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> t_user = mapper.getAllUser("t_user");
        t_user.forEach(System.out::println);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null, "xiaoming", "123456", 23, "男", "123@qq.com");
        int i = mapper.insertUser(user);
        System.out.println(user);
    }


    public void testJDBC() {
        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("", "", "");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
