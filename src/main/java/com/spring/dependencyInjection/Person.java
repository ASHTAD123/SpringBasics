package com.spring.dependencyInjection;

public class Person {

		private String name;
		private int id;
		Friend f;
		
		public Person() {
			super();
		}
		public Person(String name, int id, Friend f) {
			super();
			this.name = name;
			this.id = id;
			this.f = f;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Friend getF() {
			return f;
		}
		public void setF(Friend f) {
			this.f = f;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", id=" + id + ", f=" + f + "]";
		}
		
		
		
}
