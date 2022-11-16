package com.atzdy.ssm.controller;

import com.atzdy.ssm.exception.loginException;
import com.atzdy.ssm.pojo.Book;
import com.atzdy.ssm.pojo.User;
import com.atzdy.ssm.service.BookService;
import com.atzdy.ssm.service.UserService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.Md5Crypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/2 23:01
 * @Abstract：
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser(Model model) {
        //查询所有用户信息
        List<User> list = userService.getAllUser();
        //将员工信息在请求域中共享
        model.addAttribute("list", list);
        return "user_list";
    }

    /**
     * 实现用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password,Model model) {
        //先获取表单输入的用户名，如果没有就返回到失败界面
        if (!username.isEmpty()) {
            User userByName = userService.getUserByName(username);
            if (!password.isEmpty()) {
                //获取数据库的用户密码
                String password1 = userByName.getPassword();
                //将表单中的密码加密处理
                String password2 = Md5Crypt.md5Crypt(password.getBytes(), password1);
                if (password1.equals(password2)) {
                    List<Book> allBooks = bookService.getAllBooks();
                    model.addAttribute("bookList", allBooks);
                    System.out.println("allBooks = " + allBooks);
                    return "book_list";
                } else {
                    model.addAttribute("nopassword", "true");
                    return "login";
                }
            }
        }
        return null;
    }

    /**
     * 实现用户注册
     */
    @RequestMapping(value = "/register01", method = RequestMethod.GET)
    public String register01() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(String username, String password) {
        userService.setUser(username, password);
        return "login";
    }

    /**
     *用户中心
     * */

}