package com.zhiyou.dao;

import com.zhiyou.domain.Contract;
import com.zhiyou.domain.House;
import com.zhiyou.domain.Lessee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname Lessee
 * @Date 2021/11/27 21:17
 */
@Repository
public interface LesseeDao {

    //查询全部+分页+模糊查询
    List<Lessee> lesseeList(@Param("field") String field, @Param("keyWord") String keyWord);

}
