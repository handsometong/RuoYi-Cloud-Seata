package com.ruoyi.system.domain.dto;

/**
 *必须添加类描述
 *
 *@authortong
 *@date2022/10/313:13 下午*@version1.0 
 */
public class ReduceBalanceRequest
{
    private Long userId;

    private Integer price;

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Integer getPrice()
    {
        return price;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }
}
