package com.atzdy.mybatis.mapper;

import com.atzdy.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/25 1:57
 * @Abstract：
 */
public interface DeptMapper {

    /**
     * 通过分步查询员工以及所对应的部门信息的第二步
     *
     * @return
     * @Param deptId
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 查询部门以及部门中的员工信息
     *
     * @return
     * @Param deptId
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 查询部门以及部门中的员工信息第一步
     * @Param deptId
     * @return
     * */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
