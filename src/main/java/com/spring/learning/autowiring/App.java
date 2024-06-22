package com.spring.learning.autowiring;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		
		public static void main(String[] args) {
			
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/learning/autowiring/config.xml");
			Employee emp = context.getBean("Employee",Employee.class);
			System.out.println(emp.getAddress());
			System.out.println(emp.getContactNames());
	
		}
}
