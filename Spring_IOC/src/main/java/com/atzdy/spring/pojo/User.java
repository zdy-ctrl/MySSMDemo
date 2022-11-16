package com.atzdy.spring.pojo;



/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/3 16:31
 * @Abstract：
 */

public class User {
    private Integer Id;
    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
