			package de.bht.se.exercise02;
			public class Customer
				extends Person
 {
						private String firstName;
				
						private boolean preferred;
				
						private String lastName;
				
						private java.util.Collection<Order> order;
				
		
	
					public String getFirstName() {
						return this.firstName;
					}
				
					public void setFirstName(String firstName) { 
						this.firstName = firstName;
					}
				
					public boolean getPreferred() {
						return this.preferred;
					}
				
					public void setPreferred(boolean preferred) { 
						this.preferred = preferred;
					}
				
					public String getLastName() {
						return this.lastName;
					}
				
					public void setLastName(String lastName) { 
						this.lastName = lastName;
					}
				
					public java.util.Collection<Order> getOrder() {
						return this.order;
					}
				
					public void setOrder(java.util.Collection<Order> order) { 
						this.order = order;
					}
				

		} 
