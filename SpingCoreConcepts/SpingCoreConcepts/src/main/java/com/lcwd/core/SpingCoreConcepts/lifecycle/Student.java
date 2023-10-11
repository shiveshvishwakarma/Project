package com.lcwd.core.SpingCoreConcepts.lifecycle;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component("student5")
public class Student {

    public Student(){
        System.out.println("Creating student");
    }

    @PostConstruct
    public Void created(){
        // some inintilization
        System.out.println("Student bean is created: created()");

        return null;
    }
}
