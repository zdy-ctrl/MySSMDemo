package com.atzdy.spring.controller;

import com.atzdy.spring.dao.EmployeeDao;
import com.atzdy.spring.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/22 22:44
 * @Abstract：
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    /**
     * 显示员工列表
     */
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getEmployeeList(Model model) {
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employee_list";
    }

    /**
     * 添加功能
     */
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee) {
        //保存员工信息
        employeeDao.save(employee);
        //重定向到列表功能
        return "redirect:/employee";
    }

    /**
     * 修改功能
     */
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public String getEmployeeById(@PathVariable("id") Integer id,Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }

    /**
     * 执行更新
     */
    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public String updateEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:employee";
    }

    /**
     * 删除功能
     */
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/employee";
    }
}
