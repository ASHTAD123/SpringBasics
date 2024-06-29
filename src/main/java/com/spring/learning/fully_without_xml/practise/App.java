package com.spring.learning.fully_without_xml.practise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Car c = context.getBean("getCar",Car.class);
		System.out.println(c.getEngine());
		}
}
