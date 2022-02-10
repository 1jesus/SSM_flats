package com.zhiyou.service;

import com.zhiyou.domain.Lessee;
import com.zhiyou.domain.Rent;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Classname RentService
 * @Date 2021/11/27 21:29
 */
@Service
public interface RentService {
    //查询全部
    List<Rent> rentList(String field, String keyWord);
}
