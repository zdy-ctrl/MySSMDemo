package com.atzdy.mybatis.mapper;

import com.atzdy.mybatis.pojo.Emp;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/25 16:57
 * @Abstract：
 */
public interface DynamicSQLMapper {
    /**
     * 根据条件查询员工信息
     * <if>标签的应用
     *
     * @Param emp
     * @retrun
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 根据条件查询员工信息
     *
     * @return emp
     * @Param
     */
    List<Emp> getEmpByConditionTwo(Emp emp);

    /**
     * 根据
     * */
}
