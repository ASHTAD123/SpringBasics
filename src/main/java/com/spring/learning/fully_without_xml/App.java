package com.spring.learning.fully_without_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		// Instead of using classPathXmlContext class we are using
		// AnnotationConfigApplicationContext
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		Student s1 = context.getBean("getStudent", Student.class);
		System.out.println(s1.getBook());
	}
}
