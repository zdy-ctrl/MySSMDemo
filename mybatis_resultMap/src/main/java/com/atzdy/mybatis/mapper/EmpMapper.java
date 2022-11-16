package com.atzdy.mybatis.mapper;

import com.atzdy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/23 14:15
 * @Abstract：
 */
public interface EmpMapper {
    /**
     * 根据ID去查找对应的员工信息
     * @Param empId
     * */
    Emp getEmpByEmpId(@Param("empId") Integer empId);
    /**
     * 获取员工及对应的部门信息
     * @Peram empId
     * @return
     * */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 通过分步查询员工以及所对应的部门信息的第一步
     *
     * @return
     * @Param empId
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 查询部门以及部门中的员工信息第二步
     * @Param deptId
     * @return
     * */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
