package com.zhiyou.service;

import com.zhiyou.dao.LesseeDao;
import com.zhiyou.domain.House;
import com.zhiyou.domain.Lessee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname LesseeService
 * @Date 2021/11/27 21:20
 */
@Service
public interface LesseeService {
    //查询全部
    List<Lessee> lesseeList(String field, String keyWord);
}
