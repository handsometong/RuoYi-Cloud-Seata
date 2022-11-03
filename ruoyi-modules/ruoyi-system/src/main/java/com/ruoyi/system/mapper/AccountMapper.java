package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Account;

/**
 *必须添加类描述
 *
 *@authortong
 *@date2022/10/313:14 下午*@version1.0 
 */
public interface AccountMapper
{
    public Account selectById(Long userId);

    public void updateById(Account account);
}