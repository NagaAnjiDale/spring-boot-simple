package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, String> home() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to Spring Boot!");
        response.put("status", "Application is running");
        return response;
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello from Spring Boot");
        return response;
    }

    @GetMapping("/api/users")
    public Map<String, Object> getUsers() {
        Map<String, Object> response = new HashMap<>();
        response.put("id", 1);
        response.put("name", "John Doe");
        response.put("email", "john@example.com");
        return response;
    }

    @PostMapping("/api/echo")
    public Map<String, Object> echo(@RequestBody Map<String, Object> request) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Echo received");
        response.put("data", request);
        return response;
    }
}
