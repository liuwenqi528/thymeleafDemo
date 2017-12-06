/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-02
 * Time: 13:41
 * Description:
 */
package com.example.thymeleaf.controller;

import com.example.thymeleaf.entity.Product;
import com.example.thymeleaf.service.OrderLineService;
import com.example.thymeleaf.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

@Controller
@RequestMapping("/product")
public class OrderLineController {
    @Autowired
    private OrderLineService orderLineService;

}