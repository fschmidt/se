package com.example.eshop;
public class PersonBuilder {
	private Person person;
	
	public PersonBuilder () {
		this.person = new Person();
	}
	public PersonBuilder name (java.lang.String name) {
		person.setName(name);
		return this;
	}
	public PersonBuilder number (int number) {
		person.setNumber(number);
		return this;
	}
	public PersonBuilder address (java.lang.String address) {
		person.setAddress(address);
		return this;
	}
	public Person build() {
		return person;
	}
}
