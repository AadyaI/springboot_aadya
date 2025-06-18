package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeAadya {

    @GetMapping("/bye")
    public String home() {
        return "byeee";
    }
    @GetMapping("/greet")
    public String greetings() {
        return "greetings aadya";
    }
}
