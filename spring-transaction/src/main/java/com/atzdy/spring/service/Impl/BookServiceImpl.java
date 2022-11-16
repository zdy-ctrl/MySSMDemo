package com.atzdy.spring.service.Impl;

import com.atzdy.spring.dao.BookDao;
import com.atzdy.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/9 21:22
 * @Abstract：
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    
}
