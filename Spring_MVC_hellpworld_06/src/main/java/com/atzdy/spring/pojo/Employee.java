package com.atzdy.spring.pojo;

import lombok.Data;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/22 20:23
 * @Abstract：
 */
@Data
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Integer gender) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }
}
