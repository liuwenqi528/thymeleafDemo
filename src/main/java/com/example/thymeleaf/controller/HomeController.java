/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-02
 * Time: 13:41
 * Description:
 */
package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;
@Controller
@RequestMapping("/home")
public class HomeController  {

    @RequestMapping("/toHome")
    public String toHome(Model model){
        model.addAttribute("today", Calendar.getInstance());
        return "home";
    }
}