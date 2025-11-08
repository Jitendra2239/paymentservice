package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "Hello from DemoController ci/cd🚀";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running successfully ✅";
    }
}
