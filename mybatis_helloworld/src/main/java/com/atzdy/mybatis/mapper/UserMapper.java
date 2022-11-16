package com.atzdy.mybatis.mapper;

import com.atzdy.mybatis.pojo.User;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/18 21:27
 * @Abstract：
 */
public interface UserMapper {
    /**
     * 插入方法
     * @return 影响行数
     * */
    int insertUser();

    /**
     * 删除方法
     * @return 影响行数
     */
    int deleteUser();

    /**
     * 修改方法
     * @return 影响行数
     */
    int updateUser();

    /**
     * 根据ID查询一个实体类对象
     *
     * @return 返回一个实体类对象
     */
    User getUserById();

    /**
     * 查询所有数据
     *
     * @return 返回一个实体类集合
     * */
    List<User> getUserList();
}
