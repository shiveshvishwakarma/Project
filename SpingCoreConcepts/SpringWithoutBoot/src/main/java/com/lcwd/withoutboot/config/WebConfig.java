package com.lcwd.withoutboot.config;

import com.lcwd.withoutboot.Web.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    // Decalered the home controller bean
    @Bean
    public HomeController homeController(){
        return new HomeController();
    }
}
