package com.spring.learning.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/learning/spel/config.xml");
		seplExampleBean bean = ac.getBean("seplExampleBean", seplExampleBean.class);
		System.out.println(bean);
	}
}
