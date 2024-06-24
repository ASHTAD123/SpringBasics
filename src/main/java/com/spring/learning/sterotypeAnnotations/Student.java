package com.spring.learning.sterotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
/* @Component("new-name-of-variable-if-u-want-to-change) */
public class Student {

	@Value("121")
	private int studentId;
	@Value("21")
	private int studentRoll;
	@Value("Ashtad")
	private String studentName;

	public Student() {
		super();
	}

	public Student(int studentId, int studentRoll, String studentName) {
		super();
		this.studentId = studentId;
		this.studentRoll = studentRoll;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentRoll=" + studentRoll + ", studentName=" + studentName
				+ "]";
	}

}
