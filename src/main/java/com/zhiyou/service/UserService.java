package com.zhiyou.service;

import com.zhiyou.domain.User;
import org.springframework.stereotype.Service;

/**
 * @Classname UserService
 * @Date 2021/11/26 21:13
 */
@Service
public interface UserService {
    //查询
    User findUserByUsernameAndPassword(User user);
}
