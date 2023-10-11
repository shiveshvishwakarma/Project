package com.lcwd.core.SpingCoreConcepts.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // <--bean banane
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Pepsi {

    @Autowired
    private Soda soda;
    public Pepsi(){
        System.out.println("Creating PEPSI");

    }

    public Soda getSoda() {
        return soda;
    }

    public void setSoda(Soda soda) {
        this.soda = soda;
    }

    public void drink() {
        System.out.println("Pepsi is very cool");



    }
}
