package com.example.eshop;
public class Customer 
	extends Person {
	private java.lang.String name;
	private int number;
	private java.lang.String address;
	private java.util.Date creationDate;
	private boolean preferred;
	public Customer () {
	}

	public java.lang.String getName() { 
		return this.name;
	}
	
	public void setName(java.lang.String name) { 
		this.name = name;
	}

	public int getNumber() { 
		return this.number;
	}
	
	public void setNumber(int number) { 
		this.number = number;
	}

	public java.lang.String getAddress() { 
		return this.address;
	}
	
	public void setAddress(java.lang.String address) { 
		this.address = address;
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
} 
