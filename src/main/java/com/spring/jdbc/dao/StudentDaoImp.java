package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Entities.Student;

@Component
public class StudentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String query = "INSERT INTO STUDENT(ID,NAME,CITY) VALUES(?,?,?)";
		int row = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return row;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int update(Student student) {
		String query = "UPDATE STUDENT SET ID=?, NAME=?, CITY=? WHERE ID=?";
		int row = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity(),student.getId());
		return row;
	}

	@Override
	public int delete(int id) {
		String query = "DELETE from STUDENT WHERE ID=?";
		int row = this.jdbcTemplate.update(query,id);
		return row;
	}

	@Override
	public Student getSudent(int studentId) {
		String query ="SELECT * from student where id=?";
		RowMapper<Object> rowMapper = new RowMapperImp();
		Object s = this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return (Student) s;
	}

	@Override
	public List<Object> getAllStudents() {
		String query ="SELECT * from student";
		RowMapper<Object> rowMapper = new RowMapperImp();
		List<Object> students =this.jdbcTemplate.query(query,rowMapper);
		return students;
	}

}
