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

/*The ‘ListFactoryBean‘ class provides developer a way to create a concrete List collection class (ArrayList and LinkedList) in Spring’s bean configuration file.
You have instantiated ArrayList and injected it into Customer’s lists property at runtime.*/