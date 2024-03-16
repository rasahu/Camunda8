package com.examples.springcore.components;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	int id;
	String name;
	
	Address address;
	public Person() {
		 // manual lookup
		id=111;
		name="sunil";
		address = new Address();
	}
	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

}
