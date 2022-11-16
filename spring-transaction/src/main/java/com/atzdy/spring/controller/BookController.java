package com.atzdy.spring.controller;

import com.atzdy.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/9 21:20
 * @Abstract：
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
}
