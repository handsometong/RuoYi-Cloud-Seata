package com.ruoyi.system.domain;

import java.util.Date;

/**
 *必须添加类描述
 *
 *@authortong
 *@date2022/10/313:11 下午*@version1.0 
 */
public class Product
{

    private Integer id;
    /**
     * 价格
     */
    private Double price;
    /**
     * 库存
     */
    private Integer stock;

    private Date lastUpdateTime;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public Integer getStock()
    {
        return stock;
    }

    public void setStock(Integer stock)
    {
        this.stock = stock;
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