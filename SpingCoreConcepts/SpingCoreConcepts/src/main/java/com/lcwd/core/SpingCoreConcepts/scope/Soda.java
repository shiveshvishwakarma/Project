package com.lcwd.core.SpingCoreConcepts.scope;

import org.springframework.stereotype.Component;

@Component
public class Soda {
    public Soda(){
        System.out.println("Creating soda");
    }
}
