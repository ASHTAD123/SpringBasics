package com.spring.learning.sterotypeAnnotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		
		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/learning/sterotypeAnnotations/config.xml");
			Student s = context.getBean("student",Student.class);
			System.out.println(s);
			System.out.println("Hashcode : "+ s.hashCode());
			
			Student s1 = context.getBean("student",Student.class);
			System.out.println("Hashcode : "+ s1.hashCode());
		
		
		}
}
