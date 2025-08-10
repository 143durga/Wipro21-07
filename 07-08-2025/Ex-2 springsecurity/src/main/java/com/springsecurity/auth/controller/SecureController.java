package com.springsecurity.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - No authentication needed!";
    }

    @GetMapping("/secure-greet")
    public String greet() {
        return "Hello from secure-Greet - Requires Authentication";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin - Requires Authentication";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome User - Requires Authentication";
    }
}
