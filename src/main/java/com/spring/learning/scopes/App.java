package com.spring.learning.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//This program will tell you scope & Hashcode differences to prove
public class App {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/learning/scopes/config.xml");
	
	worker w = context.getBean("worker",worker.class);
	worker w1 = context.getBean("worker",worker.class);
	
	System.out.println(" Comparing hashcodes ");
	System.out.println(w.hashCode());
	System.out.println(w1.hashCode());
	
	boolean b = context.isPrototype("worker");
	
	String res =(b)? "Prototype scope different Hashcode" : "Singleton scope same Hashcode " ;
	
	System.out.println(res);
}
	
}
