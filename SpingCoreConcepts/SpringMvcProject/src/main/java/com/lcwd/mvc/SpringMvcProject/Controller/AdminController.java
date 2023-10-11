package com.lcwd.mvc.SpringMvcProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class AdminController {

    @RequestMapping("/admin")
    public String showLoginPageHandler(){
        return "login";
    }
}
