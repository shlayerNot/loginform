package com.example.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.login.entity.User;


@Controller
public class UserController {
    
    @GetMapping("/")
    public String login(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }
}
