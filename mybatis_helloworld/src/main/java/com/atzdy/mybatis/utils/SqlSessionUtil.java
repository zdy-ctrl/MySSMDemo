package com.atzdy.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/19 21:41
 * @Abstract：
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;
        try {
            //1.读取核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //2.创建SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //3.创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //4.创建SqlSession对象
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
}
