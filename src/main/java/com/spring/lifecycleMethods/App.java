package com.spring.lifecycleMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext applicationContext =
    			new ClassPathXmlApplicationContext("com/spring/lifecycleMethods/config.xml");
    	
    	Food f = (Food) applicationContext.getBean("Food");
    	System.out.println(f);
    	applicationContext.registerShutdownHook();
    
    }
}
