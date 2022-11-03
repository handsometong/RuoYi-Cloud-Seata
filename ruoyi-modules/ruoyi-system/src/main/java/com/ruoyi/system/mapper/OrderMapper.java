package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Order;

/**
 *必须添加类描述
 *
 *@authortong
 *@date2022/10/313:14 下午*@version1.0 
 */
public interface OrderMapper
{
    public void insert(Order order);

    public void updateById(Order order);
}
