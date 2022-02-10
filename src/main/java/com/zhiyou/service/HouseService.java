package com.zhiyou.service;

import com.github.pagehelper.PageInfo;
import com.zhiyou.domain.House;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

/**
 * @Classname HouseService
 * @Date 2021/11/27 14:55
 */
@Service
public interface HouseService {
    //查询全部
    List<House> houseList(String field, String keyWord);

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

    //模糊查询
    public PageInfo<House> getAllByField(int pageNum, String field, String keyWord);
}
