package com.spring.jdbc.auto_wiring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Entities.Student;

@Component
public class StudentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	String insertQuery = "INSERT INTO STUDENT(ID,NAME,CITY) VALUES(?,?,?)";
	String updateQuery = "UPDATE STUDENT SET ID=?, NAME=?, CITY=? WHERE ID=?";
	String deleteQuery = "DELETE from STUDENT WHERE ID=?";
	String reteiveQuery = "SELECT * from student";

	@Autowired
	public StudentDaoImp(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int insert(Student student) {
		int row = this.jdbcTemplate.update(insertQuery, student.getId(), student.getName(), student.getCity());
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
		int row = this.jdbcTemplate.update(updateQuery, student.getId(), student.getName(), student.getCity(),student.getId());
		return row;
	}

	@Override
	public int delete(int id) {
		int row = this.jdbcTemplate.update(deleteQuery, id);
		return row;
	}

	@Override
	public Student getSudent(int studentId) {
		String query = "SELECT * from student where id=?";
		RowMapper<Object> rowMapper = new RowMapperImp();
		Object s = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return (Student) s;
	}

	@Override
	public List<Object> getAllStudents() {
		RowMapper<Object> rowMapper = new RowMapperImp();
		List<Object> students = this.jdbcTemplate.query(reteiveQuery, rowMapper);
		return students;
	}

}
