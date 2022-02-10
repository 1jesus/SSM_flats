package com.zhiyou.dao;

import com.zhiyou.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @Classname UserDao
 * @Date 2021/11/26 21:02
 */
@Repository
public interface UserDao {
    //查询用户
    User findUserByUsernameAndPassword(User user);


}
