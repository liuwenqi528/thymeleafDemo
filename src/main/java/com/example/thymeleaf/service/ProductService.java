package com.example.thymeleaf.service;

import com.example.thymeleaf.entity.Product;

import java.util.List;

/**
 * 产品服务层
 */
public interface ProductService {
    public List<Product> findAll();
    public Product findById(Integer  id) ;
}
