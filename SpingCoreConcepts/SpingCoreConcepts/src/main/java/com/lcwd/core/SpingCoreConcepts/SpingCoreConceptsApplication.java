package com.lcwd.core.SpingCoreConcepts;

import Test.Test;
import com.lcwd.core.SpingCoreConcepts.scope.Pepsi;
import com.lcwd.core.SpingCoreConcepts.scope.Soda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Primary;

import java.sql.SQLOutput;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.lcwd.core", "Test"})
public class SpingCoreConceptsApplication {

	public static void main(String[] args) {

		// about the beans

		// about the dependencies


//		Animal animal = new Cow();
//		Person p = new Person(animal);
//		p.playWithAnimal();
		ApplicationContext context = SpringApplication.run(SpingCoreConceptsApplication.class, args);
//		Person personBean = context.getBean(Person.class);
//		personBean.playWithAnimal();
//		System.out.println(personBean);
//
//		Test testBean = context.getBean(Test.class);
//		testBean.testing();

	// Declared Bean

//	@Bean(name = "samosa1")
//	@Primary
//	public Samosa getSamosa1(){
//		return new Samosa("Tandoori samosa");
//	}
//
//	@Bean(name = "samosa2")
//	public Samosa getSamosa2(){
////		return new Samosa("Meets samosa");
//
//		//bean scope
//		context.getBean(Pepsi.class);
//		//System.out.println(bean);
//	//	bean.drink());
//
//
//		Pepsi bean1 = context.getBean(Pepsi.class);
//		System.out.println(bean1);

//		 Pepsi pepsi = context.getBean(Pepsi.class);
//		 System.out.println(pepsi);
//		 Soda soda = pepsi.getSoda();
//		 System.out.println(soda);
//
//		 Pepsi pepsi1 = context.getBean(Pepsi.class);
//		 System.out.println(pepsi1);
//		 Soda soda1 = pepsi1.getSoda();
//		System.out.println(soda1);
	}
}
