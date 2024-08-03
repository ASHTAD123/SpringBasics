package com.spring.dependencyInjection;

public class Teacher {

	String teacherName;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String teacherName) {
		super();
		this.teacherName = teacherName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		return " Teacher: "+teacherName  ;
	}

	

}
