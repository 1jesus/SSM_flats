package com.zhiyou.service.impl;

import com.zhiyou.dao.UserDao;
import com.zhiyou.domain.User;
import com.zhiyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Date 2021/11/26 21:14
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByUsernameAndPassword(User user) {
        return userDao.findUserByUsernameAndPassword(user);
    }

}
