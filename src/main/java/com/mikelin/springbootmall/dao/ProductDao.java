package com.mikelin.springbootmall.dao;

import com.mikelin.springbootmall.dto.ProductRequest;
import com.mikelin.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    Integer updateProduct(Integer productId, ProductRequest productRequest);
}
