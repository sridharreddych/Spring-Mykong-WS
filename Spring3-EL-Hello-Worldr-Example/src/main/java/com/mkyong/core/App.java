package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeansEL_in_xml.xml");

		Customer obj = (Customer) context.getBean("customerBean");
		System.out.println(obj);
	}
}
