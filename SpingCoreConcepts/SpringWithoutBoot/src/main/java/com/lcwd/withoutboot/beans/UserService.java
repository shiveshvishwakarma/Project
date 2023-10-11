package com.lcwd.withoutboot.beans;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void saveUser(){
        System.out.println("User is saved successfully");
    }

    public void createOrder() {
    }
}
