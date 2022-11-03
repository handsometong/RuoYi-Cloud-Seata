package com.ruoyi.system.service;

/**
 *必须添加类描述
 *
 *@authortong
 *@date2022/10/313:16 下午*@version1.0 
 */
public interface ProductService {
    /**
     * 扣减库存
     *
     * @param productId 商品 ID
     * @param amount 扣减数量
     * @return 商品总价
     */
    Double reduceStock(Long productId, Integer amount);
}
