package com.zhiyou.dao;

import com.zhiyou.domain.Contract;
import com.zhiyou.domain.House;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname ContractDao
 * @Date 2021/11/27 20:00
 */
@Repository
public interface ContractDao {

    //查询全部+分页+模糊查询
    List<Contract> contractList(@Param("field") String field, @Param("keyWord") String keyWord);
}
