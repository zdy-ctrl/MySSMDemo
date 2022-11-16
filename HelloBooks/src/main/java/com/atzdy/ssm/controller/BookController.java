package com.atzdy.ssm.controller;

import com.atzdy.ssm.pojo.Book;
import com.atzdy.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/6 23:19
 * @Abstract：
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    /**
     * 查询所有书籍
     */
    @PostMapping("/allBook")
    public String getAllBook(Model model) {
        System.out.println("================================= ");
        List<Book> allBooks = bookService.getAllBooks();
        model.addAttribute("bookList", allBooks);
        return "book_list";
    }
}
