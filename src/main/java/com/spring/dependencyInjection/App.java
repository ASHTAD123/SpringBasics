package com.spring.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext
    			("com/spring/dependencyInjection/config_setter_getter_injection.xml",
    			"com/spring/dependencyInjection/config_constructor_injection.xml");
  
    	System.out.println();
    	
    	/* Setter & Getter Injection*/
    	System.out.println("--------Setter & Getter Injection--------");
    	Student s1 = (Student) applicationContext.getBean("Student");
    	System.out.println(s1);
    	System.out.println();

    	// Constructor Injection    
    	System.out.println("--------Constructor Injection--------");
    	Person person = (Person) applicationContext.getBean("Person");
    	System.out.println(person);
    }
}
