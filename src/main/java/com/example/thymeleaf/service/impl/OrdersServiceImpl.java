/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-04
 * Time: 08:47
 * Description:
 */
package com.example.thymeleaf.service.impl;

import com.example.thymeleaf.dao.OrdersRepository;
import com.example.thymeleaf.entity.Orders;
import com.example.thymeleaf.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public List<Orders> findAll() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders findByID(Integer orderId) {
        return ordersRepository.findOne(orderId);
    }
}
