package com.example.mall.modules.product.services;

import com.example.mall.modules.product.entity.Product;
import com.example.mall.modules.product.mapper.ProductMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author w-tomato
 * @description
 * @date 2023/11/6
 */
@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public PageInfo<Product> list(Integer pageNum, Integer pageSize, String name) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(
                () -> productMapper.selectByName(name));
    }

    public void add(Product product) {
        productMapper.insert(product);
    }

    public void update(Product product) {
        productMapper.updateByPrimaryKey(product);
    }

    public void delete(Long id) {
        productMapper.deleteByPrimaryKey(id);
    }



}