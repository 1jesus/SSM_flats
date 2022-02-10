package com.zhiyou.dao;

import com.zhiyou.domain.House;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Classname HouseDao
 * @Date 2021/11/27 15:09
 */
@Repository
public interface HouseDao {
    //查询全部+分页+模糊查询
    List<House> houseList(@Param("field") String field, @Param("keyWord") String keyWord);

    //添加
    Boolean addHouse(House house);

    //详情
    House detailHouse(Integer id);

    //删除
    Boolean deleteHouse(Integer id);

    //更新前(展现数据)
    House findHouseById(Integer id);

    //更新后(更新数据)
    Boolean updateHouse(House house);

    //条件查询
    List<House> getAllByField(@Param("field") String field, @Param("keyWord") String keyWord);
}
