package com.atzdy.ssm.pojo;

import lombok.Data;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/30 22:40
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

    public User(Integer id, String username, String password, Integer age, String gender, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }
}
