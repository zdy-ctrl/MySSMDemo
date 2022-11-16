package com.atzdy.spring.Factory;

import com.atzdy.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/3 16:31
 * @Abstract：
 */
public class UserFactory implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
