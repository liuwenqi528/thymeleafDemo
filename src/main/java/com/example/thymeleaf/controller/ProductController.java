/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-02
 * Time: 13:41
 * Description:
 */
package com.example.thymeleaf.controller;

import com.example.thymeleaf.entity.Product;
import com.example.thymeleaf.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;


    @RequestMapping("/list")
    public String listAllProduct(Model model){
        List<Product> listAllProduct = productService.findAll();
        model.addAttribute("listAllProduct",listAllProduct);
        return "product/list";
    }

    @RequestMapping("/comments")
    public String comments(Integer pId , Model model){
        Product product = productService.findById(pId);
        model.addAttribute("product",product);
        return "product/comments";
    }

}