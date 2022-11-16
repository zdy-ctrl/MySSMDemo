package com.atzdy.mybatis.test;

import com.atzdy.mybatis.mapper.UserMapper;
import com.atzdy.mybatis.pojo.User;
import com.atzdy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/18 21:46
 * @Abstract：
 */
public class MyBatisTest {

    @Test
    public void testInsert() throws IOException {
        //读取MyBatis的核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配 映射文件中的SQL标签，并执行标签中的SQL语句
        int result = userMapper.insertUser();
        //sqlSession.insert("com.atzdy.mybatis.mapper.UserMapper.insertUser");  (等于上两句  )提供sql以及的唯一标识符找到sql并执行，唯一标识符是namespace.sqlId
        System.out.println("结果："+result);
        //提交事务
        //sqlSession.commit();
        //关闭sqlSession对象
        sqlSession.close();
    }

    @Test
    public void testDelete() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.deleteUser();
        System.out.println("结果 = " + result);
        sqlSession.close();
    }

    @Test
    public void testUpdate() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.updateUser();
        System.out.println("结果 = " + result);
        sqlSession.close();
    }

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User result = userMapper.getUserById();
        System.out.println("结果 = " + result);
        sqlSession.close();
    }

    @Test
    public void testGetUserList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> result = userMapper.getUserList();
        result.forEach(System.out::println);
        sqlSession.close();
    }
}
