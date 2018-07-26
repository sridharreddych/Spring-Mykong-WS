package com.mkyong.common;

public class FileNameGenerator
{
	private String name;
	private String type;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void printHello() {
		// TODO Auto-generated method stub
		System.out.println("I am in PrintHello method");
		System.out.println("name is :"+name);
		System.out.println("type is :"+type);
	}
}