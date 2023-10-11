package com.lcwd.first.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @RequestMapping("/todos")
    public List<String> justTest(){
        List<String> todos= Arrays.asList("Lean java", "Lean Spring Boot", "Develop project",
        "Learn java","Learn Django", "Learn Nodejs", "Learn PHP");
        return todos;
    }
}
