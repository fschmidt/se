package com.example.eshop;
public class Employee 
	extends Person {
	private java.lang.String name;
	private int number;
	private java.lang.String address;
	private int income;
	private java.lang.String qualification;
	public Employee () {
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

	public int getIncome() { 
		return this.income;
	}
	
	public void setIncome(int income) { 
		this.income = income;
	}

	public java.lang.String getQualification() { 
		return this.qualification;
	}
	
	public void setQualification(java.lang.String qualification) { 
		this.qualification = qualification;
	}
} 
