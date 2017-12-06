/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-02
 * Time: 13:41
 * Description:
 */
package com.example.thymeleaf.controller;

import com.example.thymeleaf.entity.Orders;
import com.example.thymeleaf.entity.Product;
import com.example.thymeleaf.service.OrdersService;
import com.example.thymeleaf.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/list")
    public String listAllOrder(Model model){
        List<Orders> ordersList = ordersService.findAll();
        model.addAttribute("orderList",ordersList);
        return "order/list";
    }
    @RequestMapping("/detail")
    public String getOrderDetail(Integer orderId,Model model){
        Orders orders = ordersService.findByID(orderId);
        model.addAttribute("orders",orders);
        return "order/details";
    }
}