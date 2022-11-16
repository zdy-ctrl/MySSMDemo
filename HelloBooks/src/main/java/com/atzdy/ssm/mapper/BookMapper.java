package com.atzdy.ssm.mapper;

import com.atzdy.ssm.pojo.Book;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/6 23:12
 * @Abstract：
 */

public interface BookMapper {
    /**
     * 查询所有书籍
     */
    List<Book> getAllBook();

    /**
    * 删除书籍
    * */


}
