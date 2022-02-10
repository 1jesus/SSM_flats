package com.zhiyou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.dao.HouseDao;
import com.zhiyou.domain.House;
import com.zhiyou.service.HouseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname HouseServiceImpl
 * @Date 2021/11/27 14:59
 */
@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseDao houseDao;

    //查询全部
    @Override
    public List<House> houseList(String field, String keyWord) {
        return houseDao.houseList(field, keyWord);
    }

    //添加
    @Override
    public Boolean addHouse(House house) {
        return houseDao.addHouse(house);
    }

    //详情
    @Override
    public House detailHouse(Integer id) {
        return houseDao.detailHouse(id);
    }

    //删除
    @Override
    public Boolean deleteHouse(Integer id) {
        return houseDao.deleteHouse(id);
    }

    //更新前(展现数据)
    @Override
    public House findHouseById(Integer id) {
        return houseDao.findHouseById(id);
    }

    //更新后(更新数据)
    @Override
    public Boolean updateHouse(House house) {
        return houseDao.updateHouse(house);
    }


    //模糊查询
    public PageInfo<House> getAllByField(int pageNum, String field, String keyWord) {
        PageHelper.startPage(pageNum, 4);

        List<House> allByField = houseDao.getAllByField(field, keyWord);
        PageInfo<House> pageInfo = new PageInfo<>(allByField);
        return pageInfo;
    }

}
