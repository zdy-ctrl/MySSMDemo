package com.atzdy.ssm.pojo;

import lombok.Data;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/6 23:03
 * @Abstract：
 */
@Data
public class Book {
    private String name;
    private String introduce;

    public Book() {
    }

    public Book(String name, String introduce) {
        this.name = name;
        this.introduce = introduce;
    }

}
