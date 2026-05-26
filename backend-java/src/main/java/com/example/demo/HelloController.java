package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/java/hello")
    public String hello() {
        return "Hello from Java Spring Boot!";
    }
}