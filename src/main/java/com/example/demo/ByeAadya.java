package com.example.demo;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class ByeAadya {

    @GetMapping("/bye")
    public String home() {
        return "byeee";
    }
    @PostMapping("/greet")
    public String greet(String aadyaName , String inputUser2 , String inputUser3 , Model model) {
        System.out.println("aadyaName: " + aadyaName );
        model.addAttribute("userLoggedin1234", aadyaName);
        model.addAttribute("inputUser2", inputUser2);
        model.addAttribute("inputUser3", inputUser3);
        return "result";
    }
}
