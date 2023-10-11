package Confing.xml.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Xml main started");

        ApplicationContext context = new ClassPathXmlApplicationContext("confing/xml/beans/config.xml");
    }
}
