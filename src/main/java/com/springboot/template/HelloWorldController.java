package com.springboot.template;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    
    @GetMapping({"/", "/hello"})
    public String index(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot with Thymeleaf!");
        return "index";
    }
}
