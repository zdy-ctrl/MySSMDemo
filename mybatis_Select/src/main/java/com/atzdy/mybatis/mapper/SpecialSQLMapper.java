package com.atzdy.mybatis.mapper;

import com.atzdy.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/21 22:44
 * @Abstract：
 */
public interface SpecialSQLMapper {
    /**
     * 测试模糊查询
     * @param fuzzy
     * @return
     * */
    List<User> testFuzzy(@Param("fuzzy") String fuzzy);

    /**
     * 批量删除
     * @param ids
     * @return
     * */
    int deleteMore(@Param("ids") String ids);

    /**
     * 动态设置表名，查询所有的用户信息
     *
     * @return
     * @Param tableName
     */
    List<User> getAllUser(@Param("tableName") String tableName);

    /**
     * 添加用户信息（添加功能来获取自增的主键）
     *
     * @return userGeneratedKeys：设置使用自增的主键
     * keyProperty：因为增删改有统一的返回值是受影响的行数，因此只能将获取的自增的主键放在传输的参数User对象的某个属性中
     * @Param user
     */
    int insertUser(User user);
}
