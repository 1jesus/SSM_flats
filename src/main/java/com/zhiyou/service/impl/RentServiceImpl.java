package com.zhiyou.service.impl;

import com.zhiyou.dao.RentDao;
import com.zhiyou.domain.Lessee;
import com.zhiyou.domain.Rent;
import com.zhiyou.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname RentServiceImpl
 * @Date 2021/11/27 21:30
 */
@Service
public class RentServiceImpl implements RentService {
    @Autowired
    private RentDao rentDao;

    @Override
    public List<Rent> rentList(String field, String keyWord) {
        return rentDao.rentList(field, keyWord);
    }
}
