package com.mikelin.springbootmall.dao;

import com.mikelin.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
