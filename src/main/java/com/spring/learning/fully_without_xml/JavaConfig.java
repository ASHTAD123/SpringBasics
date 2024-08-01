package com.spring.learning.fully_without_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Book1 getBook() {
		Book1 book = new Book1();
		return book;
	}
	@Bean
	//by default bean name will be method name
	public Student getStudent() {

		Student s = new Student(getBook());
		return s;
	}
}
