package com.spring.learning.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
		

		private Address address;

		@Autowired
		@Qualifier("contactNamesDeedu")
		private Contacts contactNames;
		
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(Address address, Contacts contactNames) {
			super();
			this.address = address;
			this.contactNames = contactNames;
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
		 * @return the contactNames
		 */
		public Contacts getContactNames() {
			return contactNames;
		}
		/**
		 * @param contactNames the contactNames to set
		 */
		public void setContactNames(Contacts contactNames) {
			this.contactNames = contactNames;
		}
		
		
		
		
}
