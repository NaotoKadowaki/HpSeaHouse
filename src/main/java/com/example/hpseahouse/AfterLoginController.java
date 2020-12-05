package com.example.hpseahouse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("LoginForm")
@Controller
public class AfterLoginController {

    @RequestMapping(value = "/afterlogin",method = RequestMethod.GET)
    public String afterloginGet(Model model){
        return"afterlogin";
    }
}
