package com.example.thymeleaf.service;

import com.example.thymeleaf.entity.Customer;

public interface CustomerService {
    Customer findById(Integer id);
}
