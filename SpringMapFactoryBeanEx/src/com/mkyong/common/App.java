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


/*You have instantiated a HashMap and injected it into Customer’s map property at runtime.
The ‘MapFactoryBean‘ class provides developer a way to create a concrete Map collection class (HashMap and TreeMap) in Spring’s bean configuration file.

Here’s a MapFactoryBean example, it will instantiate a HashMap at runtime,, and inject it into a bean property.*/