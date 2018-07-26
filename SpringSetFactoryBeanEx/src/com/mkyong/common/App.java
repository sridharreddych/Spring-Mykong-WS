package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		Customer cust = (Customer) context.getBean("CustomerBean");
		System.out.println(cust);
		
	}
}
/*
The ‘SetFactoryBean‘ class provides developer a way to create a concrete Set collection (HashSet and TreeSet) in Spring’s bean configuration file.
You have instantiated HashSet and and injected it into Customer’s sets property at runtime.*/