package com.example.hpseahouse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class seahouseController {
    @GetMapping("/seahouse")
    public String seahouse(Model model){
        model.addAttribute("message","seahouse iouzima");
        return "seahouse";
    }
}
