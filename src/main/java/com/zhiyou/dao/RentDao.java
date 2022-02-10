package com.zhiyou.dao;

import com.zhiyou.domain.Lessee;
import com.zhiyou.domain.Rent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname RentDao
 * @Date 2021/11/27 21:26
 */
@Repository
public interface RentDao {
    //查询全部+分页+模糊查询
    List<Rent> rentList(@Param("field") String field, @Param("keyWord") String keyWord);
}
