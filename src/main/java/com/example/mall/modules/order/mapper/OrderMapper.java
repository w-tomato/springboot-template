package com.example.mall.modules.order.mapper;

import com.example.mall.modules.order.entity.Order;

import java.util.List;

public interface OrderMapper {

    List<Order> list(Integer userId);

    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}