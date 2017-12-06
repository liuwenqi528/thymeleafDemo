package com.example.thymeleaf.service;

import com.example.thymeleaf.entity.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> findAll();

    Orders findByID(Integer orderId);
}
