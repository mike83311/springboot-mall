package com.mikelin.springbootmall.service;

import com.mikelin.springbootmall.dto.ProductQueryParams;
import com.mikelin.springbootmall.dto.ProductRequest;
import com.mikelin.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    Integer countProduct(ProductQueryParams productQueryParams);
}
