package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    final String hostname = System.getenv().getOrDefault("HOSTNAME", " unknown");

    @GetMapping("hello")
    public String hello() {
        return "Hello from Spring Boot! " + new java.util.Date() + " on " + hostname + "\n";

    }
}
