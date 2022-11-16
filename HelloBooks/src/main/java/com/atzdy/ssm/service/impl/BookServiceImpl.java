package com.atzdy.ssm.service.impl;

import com.atzdy.ssm.mapper.BookMapper;
import com.atzdy.ssm.pojo.Book;
import com.atzdy.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/6 23:11
 * @Abstract：
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> getAllBooks() {
        return  bookMapper.getAllBook();
    }
}
