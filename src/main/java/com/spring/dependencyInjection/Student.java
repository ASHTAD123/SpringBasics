package com.spring.dependencyInjection;

public class Student {

	private int StudentId;
	private String StudentName;
	private String StudentAddress;
	Teacher teacher;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentAddress, Teacher teacher1) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentAddress = studentAddress;
		teacher1 = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting Student id");
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting Student name");
		StudentName = studentName;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Student Address");
		StudentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ ", teacher=" + teacher + "]";
	}

}
