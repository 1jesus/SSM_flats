package com.zhiyou.service.impl;

import com.zhiyou.dao.LesseeDao;
import com.zhiyou.domain.House;
import com.zhiyou.domain.Lessee;
import com.zhiyou.service.LesseeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname LesseeServiceImpl
 * @Date 2021/11/27 21:21
 */
@Service
public class LesseeServiceImpl implements LesseeService {
    @Autowired
    private LesseeDao lesseeDao;

    @Override
    public List<Lessee> lesseeList(String field, String keyWord) {
        return lesseeDao.lesseeList(field, keyWord);
    }
}
