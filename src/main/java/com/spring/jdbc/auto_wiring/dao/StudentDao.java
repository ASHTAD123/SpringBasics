package com.spring.jdbc.auto_wiring.dao;

import java.util.List;

import com.spring.jdbc.Entities.Student;

public interface StudentDao {
		
		public int insert(Student student);

		public int update(Student student);

		public int delete(int id);
		
		//can also use generic type
		public Object getSudent(int studentId);
		
		public List<Object> getAllStudents();
}
