package de.bht.se.exercise01;
	public class Customer 
	{
	private java.lang.String lastName;
	private java.util.Date creationDate;
	private boolean preferred;
	private java.lang.String firstName;
	private java.util.List<org.eclipse.emf.ecore.impl.DynamicEObjectImpl@cfd139 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@1b10810 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))> has;
	
	private java.util.List<Order> orders;
	
	public Customer () {
	}

	public java.lang.String getLastName() { 
		return this.lastName;
	}
	
	public void setLastName(java.lang.String lastName) { 
		this.lastName = lastName;
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	}
	
	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	}

	public boolean getPreferred() { 
		return this.preferred;
	}
	
	public void setPreferred(boolean preferred) { 
		this.preferred = preferred;
	}

	public java.lang.String getFirstName() { 
		return this.firstName;
	}
	
	public void setFirstName(java.lang.String firstName) { 
		this.firstName = firstName;
	}
} 
