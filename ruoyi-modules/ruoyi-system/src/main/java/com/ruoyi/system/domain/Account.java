package com.ruoyi.system.domain;

/**
 *必须添加类描述
 *
 *@authortong
 *@date2022/10/313:10 下午*@version1.0 
 */

import java.util.Date;

public class Account
{
    private Long id;

    /**
     * 余额
     */
    private Double balance;

    private Date lastUpdateTime;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Double getBalance()
    {
        return balance;
    }

    public void setBalance(Double balance)
    {
        this.balance = balance;
    }

    public Date getLastUpdateTime()
    {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime)
    {
        this.lastUpdateTime = lastUpdateTime;
    }
}