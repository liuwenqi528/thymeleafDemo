/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-04
 * Time: 08:47
 * Description:
 */
package com.example.thymeleaf.service.impl;

import com.example.thymeleaf.dao.OrderLineRepository;
import com.example.thymeleaf.service.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderLineServiceImpl implements OrderLineService {
    @Autowired
    private OrderLineRepository orderLineRepository;
}
