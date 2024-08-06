package com.spring.jdbc.auto_wiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.auto_wiring.dao.StudentDao;
import com.spring.jdbc.auto_wiring.dao.StudentDaoImp;


public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// keeping child object using parent reference
		StudentDao studentDao = context.getBean(StudentDao.class);


		//Single student
		Object o = studentDao.getSudent(2321);
		System.out.println(o);
		
		//Multiple students
		Object ob = studentDao.getAllStudents();
		System.out.println(ob);
	}

}
