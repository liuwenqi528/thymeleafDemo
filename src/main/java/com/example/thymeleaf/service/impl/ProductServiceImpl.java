/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-02
 * Time: 13:56
 * Description:
 */
package com.example.thymeleaf.service.impl;

import com.example.thymeleaf.dao.ProductRepository;
import com.example.thymeleaf.entity.Product;
import com.example.thymeleaf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findById(Integer  id) {
        return productRepository.findOne(id);
    }
}
