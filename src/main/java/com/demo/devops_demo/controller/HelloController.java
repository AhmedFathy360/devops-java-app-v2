package com.demo.devops_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String showUI(Model model) {
        model.addAttribute("message", "Hello from Kubernetes CI/CD Pipeline!");
        return "index";
}
}