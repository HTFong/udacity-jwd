package com.udacity.jdnd.course1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Greetings {
    @GetMapping("simplehome")
    public String getHome(Model model, boolean firstVisit) {
        //model.addAttribute("firstVisit",false);
        firstVisit=false;
        return "home";
    }
    @PostMapping("simplehome")
    public String hello(Model model) {
        model.addAttribute("firstVisit",true);
        return "home";
    }
}
