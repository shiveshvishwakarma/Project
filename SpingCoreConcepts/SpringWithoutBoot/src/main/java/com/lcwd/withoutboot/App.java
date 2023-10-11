package com.lcwd.withoutboot;

import com.lcwd.withoutboot.Web.HomeController;
import com.lcwd.withoutboot.beans.CartService;
import com.lcwd.withoutboot.beans.OrderService;
import com.lcwd.withoutboot.beans.UserService;
import com.lcwd.withoutboot.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;


/**
 * Hello world!
 *
 */
public class  App
{
    public static void main( String[] args )
    {
        System.out.println( "Application started" );
        // we have to create object of application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context);
        CartService cartService1 = context.getBean("cartService1", CartService.class);
        cartService1.createCart();

        UserService bean = context.getBean(UserService.class);
        bean.saveUser();

        UserService bean1 = context.getBean(UserService.class);
        bean1.createOrder();

        HomeController ho = context.getBean(HomeController.class);
        ho.homePage();

    }
}
