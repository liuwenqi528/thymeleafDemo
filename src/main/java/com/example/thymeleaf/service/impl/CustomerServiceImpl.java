/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-04
 * Time: 08:47
 * Description:
 */
package com.example.thymeleaf.service.impl;

import com.example.thymeleaf.dao.CustomerRepository;
import com.example.thymeleaf.entity.Customer;
import com.example.thymeleaf.service.CommentService;
import com.example.thymeleaf.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id);
    }
}
