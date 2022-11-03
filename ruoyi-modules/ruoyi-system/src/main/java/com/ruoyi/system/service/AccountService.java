package com.ruoyi.system.service;

/**
 *必须添加类描述
 *
 *@authortong
 *@date2022/10/313:15 下午*@version1.0 
 */
public interface AccountService {
    /**
     * 账户扣减
     * @param userId 用户 ID
     * @param price 扣减金额
     */
    void reduceBalance(Long userId, Double price);
}
