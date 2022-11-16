package com.atzdy.mybatis.mapper;

import com.atzdy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/26 20:33
 * @Abstract：
 */
public interface CacheMapper {

    /**
     * 根据员工Id查询员工信息
     * @Param empId
     * @return
     * */
    Emp getEmpById(@Param("empId") Integer empId);
}
