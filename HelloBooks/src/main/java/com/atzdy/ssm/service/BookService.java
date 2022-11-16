package com.atzdy.ssm.service;

import com.atzdy.ssm.pojo.Book;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/6 23:02
 * @Abstract：
 */
public interface BookService {
    /**
     * 查询所有书籍
     */
    List<Book> getAllBooks();
}
