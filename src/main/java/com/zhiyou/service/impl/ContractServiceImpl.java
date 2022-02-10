package com.zhiyou.service.impl;

import com.zhiyou.dao.ContractDao;
import com.zhiyou.domain.Contract;
import com.zhiyou.domain.House;
import com.zhiyou.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ContractServiceImpl
 * @Date 2021/11/27 20:02
 */
@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractDao contractDao;

    @Override
    public List<Contract> contractList(String field, String keyWord) {
        return contractDao.contractList(field, keyWord);
    }
}
