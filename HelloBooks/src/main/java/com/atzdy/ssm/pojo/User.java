package com.atzdy.ssm.pojo;

import lombok.Data;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/2 23:55
 * @Abstract：
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String gender;
    private String email;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, String gender, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }
}
