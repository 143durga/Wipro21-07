package com.wiproThymeleaf1.wiproTymeleaf1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/greet")
    public String greet(Model model) {
        model.addAttribute("name", "Durga Bhavani");
        model.addAttribute("message", "Welcome to Thymeleaf with Spring Boot!");
        return "greet";  // maps to greeting.html
    }
}

