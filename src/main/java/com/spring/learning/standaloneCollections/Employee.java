package com.spring.learning.standaloneCollections;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
		
		private Address address;
		private List<String> collogues;
			
		
		public Employee() {
			super();
		}
		public Employee(Address address, List<String> collogues) {
			super();
			this.address = address;
			this.collogues = collogues;
		}
		/**
		 * @return the address
		 */
		public Address getAddress() {
			return address;
		}
		/**
		 * @param address the address to set
		 */
		public void setAddress(Address address) {
			this.address = address;
		}
		/**
		 * @return the collogues
		 */
		public List<String> getCollogues() {
			return collogues;
		}
		/**
		 * @param collogues the collogues to set
		 */
		public void setCollogues(List<String> collogues) {
			this.collogues = collogues;
		}
		
		
		
		
}
