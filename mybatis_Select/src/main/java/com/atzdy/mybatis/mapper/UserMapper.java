package com.atzdy.mybatis.mapper;

import com.atzdy.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/20 3:28
 * @Abstract：
 */
public interface UserMapper {
    /**
     * 根据用户ID查询用户信息
     *
     * @param id
     * @return 用户信息
     */
    User getUserById(@Param("id") int id);

    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<User> getUserList();

    /**
     * 查询用户的总记录数
     *
     * @return
     */
    int getCount();

    /**
     * 根据用户id查询用户信息为map集合
     *
     * @param id
     * @return
     */
    Map<String, Object> getUserToMap(@Param("id") int id);

    /**
     * 查询所有用户信息为map集合
     *
     * @return
     */
    //放进一个list集合中
    List<Map<String, Object>> getAllUserToMap();
    //放进一个大的map集合中
    @MapKey("id")
    Map<String, Object> getAllUserToMapByParam();

}
