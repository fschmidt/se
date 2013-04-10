package com.example.eshop;
public class EmployeeBuilder {
	private Employee employee;
	
	public EmployeeBuilder () {
		this.employee = new Employee();
	}
	public EmployeeBuilder name (java.lang.String name) {
		employee.setName(name);
		return this;
	}
	public EmployeeBuilder number (int number) {
		employee.setNumber(number);
		return this;
	}
	public EmployeeBuilder address (java.lang.String address) {
		employee.setAddress(address);
		return this;
	}
	public EmployeeBuilder income (int income) {
		employee.setIncome(income);
		return this;
	}
	public EmployeeBuilder qualification (java.lang.String qualification) {
		employee.setQualification(qualification);
		return this;
	}
	public Employee build() {
		return employee;
	}
}
