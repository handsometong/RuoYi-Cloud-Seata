package com.ruoyi.system.mapper;

/**
 *必须添加类描述
 *
 *@authortong
 *@date2022/10/313:14 下午*@version1.0 
 */
import com.ruoyi.system.domain.Product;

public interface ProductMapper
{
    public Product selectById(Long productId);

    public void updateById(Product product);
}
