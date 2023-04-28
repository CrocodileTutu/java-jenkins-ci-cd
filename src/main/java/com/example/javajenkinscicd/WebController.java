package com.example.javajenkinscicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/")
    public String home() {
        return "Hello! How are you today?";
    }
}
