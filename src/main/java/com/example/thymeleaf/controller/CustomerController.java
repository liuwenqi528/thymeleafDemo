/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-02
 * Time: 13:41
 * Description:
 */
package com.example.thymeleaf.controller;

import com.example.thymeleaf.entity.Customer;
import com.example.thymeleaf.service.CustomerService;
import com.example.thymeleaf.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/customer")
@SessionAttributes("user")//放入Session的值不能是Null，否则会报异常：java.lang.IllegalArgumentException: Attribute value must not be null
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/getOneCustomer")
    public String getOneCustomer(Integer id,Model model) {
        Customer c = customerService.findById(id);
        model.addAttribute("user",c);
        model.addAttribute("footer","footer");
        return "redirect:/home/toHome";
    }

}