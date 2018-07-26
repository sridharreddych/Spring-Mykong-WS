package com.mkyong.common;

public class Customer
{
	private String name;
	private String address;
	private int age;

	public Customer(String name, String address, int age) {
		System.out.println("I am 1st Argument  constructo being called");
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public Customer(String name, int age, String address) {
		System.out.println("I am 2nd Argument constructo being called");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	

	//getter and setter methods
	public String toString(){
		return " name : " +name + "\n address : "
               + address + "\n age : " + age;
	}

}