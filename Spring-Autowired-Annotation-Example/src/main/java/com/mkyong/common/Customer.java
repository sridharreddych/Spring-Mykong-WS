package com.mkyong.common;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	@Autowired(required=false)
	private Person person;
	private int type;
	private String action;

	public Person getPerson() {
		return person;
	}
	
	@Autowired
	public Customer(Person person) {
		this.person = person;
		System.out.println("I am being called through constructor");
	}
	
	@Autowired
	public void setPerson(Person person) {
		this.person = person;
		System.out.println("I am being calleed through Setter Autowired");
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", type=" + type + ", action="
				+ action + "]";
	}

	
}