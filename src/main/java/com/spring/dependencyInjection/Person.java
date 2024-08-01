package com.spring.dependencyInjection;

public class Person {

		private String name;
		private int id;

		public Person(int id,String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			
			return this.name +" : "+this.id;
		}
		
		
}
