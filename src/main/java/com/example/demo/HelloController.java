package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @GetMapping("/hi")
    public String hi() {
        return "Hello Aadya!";
    }

     @GetMapping("/")
    public String home() {
        return "index";
    }
     
}
