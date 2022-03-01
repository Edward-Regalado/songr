package com.myapp.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Capitalize {
    @GetMapping("capitalize/{upperCase}")
    public String capitalize(Model m, @PathVariable String upperCase){
        m.addAttribute("upperCase", upperCase.toUpperCase());
        return "capitalize.html";
    }
}
