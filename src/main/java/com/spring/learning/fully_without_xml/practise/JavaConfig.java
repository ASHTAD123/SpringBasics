package com.spring.learning.fully_without_xml.practise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	

	@Bean
	public Engine getEngine() {
		Engine e = new Engine();
		return e;
	}
	@Bean
	public Car getCar() {
		Car c = new Car("A","B","C",getEngine());
		return c;
	}

}
