package com.zhiyou.service.impl;

import com.zhiyou.dao.AoplogDao;
import com.zhiyou.domain.Aoplog;
import com.zhiyou.service.AoplogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname AoplogServiceImpl
 * @Date 2021/12/17 22:35
 */
@Service
public class AoplogServiceImpl implements AoplogService {

    @Autowired
    private AoplogDao aoplogDao;

    @Override
    public void insertLog(Aoplog aoplog) {
        aoplogDao.insertLog(aoplog);
    }
}

