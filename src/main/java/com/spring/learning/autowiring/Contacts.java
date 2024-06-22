package com.spring.learning.autowiring;

import java.util.Map;

public class Contacts {
		
		private Map<String,String> contactNames;

		public Contacts() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Contacts(Map<String, String> contactNames) {
			super();
			this.contactNames = contactNames;
		}

		/**
		 * @return the contactNames
		 */
		public Map<String, String> getContactNames() {
			return contactNames;
		}

		/**
		 * @param contactNames the contactNames to set
		 */
		public void setContactNames(Map<String, String> contactNames) {
			this.contactNames = contactNames;
		}

		@Override
		public String toString() {
			return "Contacts [contactNames=" + contactNames + "]";
		}
		
		
}
