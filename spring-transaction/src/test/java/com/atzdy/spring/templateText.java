package com.atzdy.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/9 15:33
 * @Abstract：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class templateText {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate() {
        String sql = "insert into t_user values(null,?,?,?,?,?)";
        int result = jdbcTemplate.update(sql, "张三", "123123", "18", "男", "123123@qq.com");
        System.out.println("result = " + result);
    }

    @Test
    public void testGetUserById() {

    }
}
