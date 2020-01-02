package com.imooc.mall.dao;

import com.imooc.mall.domain.MallOrder;

public interface MallOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    MallOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);
}