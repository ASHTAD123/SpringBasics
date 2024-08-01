package com.spring.learning.standaloneCollections;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		
		public static void main(String[] args) {
			
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/learning/standaloneCollections/config.xml");
			Employee emp = context.getBean("Employee",Employee.class);
			System.out.println(emp.getCollogues());

	
		}
}
