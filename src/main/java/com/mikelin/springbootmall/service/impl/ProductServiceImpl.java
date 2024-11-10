package com.mikelin.springbootmall.service.impl;

import com.mikelin.springbootmall.dao.ProductDao;
import com.mikelin.springbootmall.dto.ProductRequest;
import com.mikelin.springbootmall.model.Product;
import com.mikelin.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public Integer updateProduct(Integer productId, ProductRequest productRequest) {
        return productDao.updateProduct(productId, productRequest);
    }
}
