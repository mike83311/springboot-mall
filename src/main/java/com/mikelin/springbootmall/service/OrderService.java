package com.mikelin.springbootmall.service;

import com.mikelin.springbootmall.dto.CreateOrderRequest;
import com.mikelin.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
