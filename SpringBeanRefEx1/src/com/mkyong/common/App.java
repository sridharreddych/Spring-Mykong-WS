package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.output.OutputHelper;

public class App {
	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Common.xml","Spring-Output.xml","Bean-In-Same.xml")*/;
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean-In-Same.xml");

		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	        output.generateOutput();
	}
}