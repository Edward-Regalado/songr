package com.myapp.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Capitalize {
    @GetMapping("capitalize/{upperCase}")
    public String capitalize(Model m, @PathVariable String upperCase){
        String word = upperCase.toUpperCase();
        m.addAttribute("upperCase", word);
        return "capitalize.html";
    }
}
