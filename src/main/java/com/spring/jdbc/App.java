package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Entities.Student;
import com.spring.jdbc.dao.StudentDao;

public class App {

	public static void main(String[] args) {
			
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
	
		//keeping child object using parent reference
		StudentDao studentDao = context.getBean("StudentDaoImp",StudentDao.class);
		
		Student s = new Student();
		s.setId(12181);
		s.setName("Student9");
		s.setCity("Luckn8ow");
		
		int res = studentDao.insert(s);
		
		System.out.println("Result :"+res);
		
		
		
		
		
		//JdbcTemplate template = context.getBean("dataTemplate",JdbcTemplate.class);
		
		//insert
		//String query= "INSERT INTO STUDENT(ID,NAME,CITY) VALUES(?,?,?)";
		
		//fire query
		//int result = template.update(query,2321,"ABC","Kanpur");
		
		//System.out.println("Number of records inserted : " +result);
	}

}
