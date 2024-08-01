package com.spring.learning.fully_without_xml;

//can use java config file instead of this annotation
//@Component("myStudent")
public class Student {

	private Book1 book;

	public Student() {
		super();
	}

	public Student(Book1 book) {
		super();
		this.book = book;
	}

	public Book1 getBook() {
		System.out.println("get book method called");
		this.book.read();
		return book;
	}

	public void setBook(Book1 book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [book=" + book + "]";
	}

}
