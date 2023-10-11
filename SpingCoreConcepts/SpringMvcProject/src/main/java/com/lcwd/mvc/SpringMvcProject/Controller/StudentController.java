package com.lcwd.mvc.SpringMvcProject.Controller;

import com.lcwd.mvc.SpringMvcProject.models.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    // create student
    /*
    data: required
     */

//    @PostMapping("/create")
//    public String createStudent(@RequestBody Student Map<String, Object> data) {
//        // we have to create student
//
//   //     System.out.println(data);
//        return "created";
//    }
}
