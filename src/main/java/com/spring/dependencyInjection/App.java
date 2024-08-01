package com.spring.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/dependencyInjection/config.xml",
    			"com/spring/dependencyInjection/config_reference_injection.xml",
    			"com/spring/dependencyInjection/config_constructor_injection.xml");
  
    	// Setter & Getter Injection
    	Student s1 = (Student) applicationContext.getBean("Student");
    	System.out.println(s1);
    	
    	// Reference Injection
    	A aObject = (A) applicationContext.getBean("ARef");
    	System.out.println(aObject.getX());
    	System.out.println("B value from A class : " + aObject.getObj().getY());
    	
    	// Constructor Injection    
    	Person person = (Person) applicationContext.getBean("person");
    	System.out.println(person);
    }
}
