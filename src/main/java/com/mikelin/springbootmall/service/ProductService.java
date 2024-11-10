package com.mikelin.springbootmall.service;

import com.mikelin.springbootmall.dto.ProductRequest;
import com.mikelin.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
