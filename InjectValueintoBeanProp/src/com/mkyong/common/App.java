package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");*/
		/*ApplicationContext context = new ClassPathXmlApplicationContext(
				"Inject-Value-Shortcut.xml");*/
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"p-Name-Space-.xml");

		FileNameGenerator obj = (FileNameGenerator) context.getBean("FileNameGenerator");
		obj.printHello();
	}
}