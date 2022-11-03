package com.ruoyi.system.service;

import com.ruoyi.system.domain.dto.PlaceOrderRequest;

/**
 *必须添加类描述
 *
 *@authortong
 *@date2022/10/313:15 下午*@version1.0 
 */
public interface OrderService {
    /**
     * 下单
     *
     * @param placeOrderRequest 订单请求参数
     */
    void placeOrder(PlaceOrderRequest placeOrderRequest);
}
