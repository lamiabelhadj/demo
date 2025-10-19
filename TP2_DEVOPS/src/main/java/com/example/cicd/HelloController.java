package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello from CI/CD demo! Time: " + OffsetDateTime.now();
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
