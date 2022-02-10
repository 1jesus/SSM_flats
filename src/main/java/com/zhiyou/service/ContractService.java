package com.zhiyou.service;

import com.zhiyou.domain.Contract;
import com.zhiyou.domain.House;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ContractService
 * @Date 2021/11/27 20:01
 */
@Service
public interface ContractService {
    //查询全部
    List<Contract> contractList(String field, String keyWord);
}
