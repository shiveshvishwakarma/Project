package com.lcwd.mvc.SpringMvcProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String helloApi(){
        return "Hello, how are you, what are you doing shailendra";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<String> getUserData(){
        return Arrays.asList("Ram", "shyam", "mohan");

    }
}
