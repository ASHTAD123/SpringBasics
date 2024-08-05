package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Entities.Student;

public class StudentDaoImp implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int insert(Student student) {
		String query= "INSERT INTO STUDENT(ID,NAME,CITY) VALUES(?,?,?)";
		int row = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return row;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
