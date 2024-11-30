package com.mikelin.springbootmall.dao;

import com.mikelin.springbootmall.dto.CreateOrderRequest;
import com.mikelin.springbootmall.dto.OrderQueryParams;
import com.mikelin.springbootmall.model.Order;
import com.mikelin.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
