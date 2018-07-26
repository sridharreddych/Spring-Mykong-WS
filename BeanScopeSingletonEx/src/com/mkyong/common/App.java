package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.services.CustomerService;

public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    	 new ClassPathXmlApplicationContext("SpringBeans.xml");

    	CustomerService custA = (CustomerService)context.getBean("customerService");
    	custA.setMessage("Message by custA");
    	System.out.println("Message : " + custA.getMessage());
    	//custA=null;
    	
    	CustomerService custAA = (CustomerService)context.getBean("customerService");
    	//custAA.setMessage("Message by custAA");
    	System.out.println("Message : " + custAA.getMessage());

    	//retrieve it again
    	
    	CustomerService custB = (CustomerService)context.getBean("cs1");
    	custB.setMessage("Message by custB");
    	System.out.println("Message : " + custB.getMessage());
    	
    	
    	
    	CustomerService custC = (CustomerService)context.getBean("cd3");
    	custC.setMessage("Message by custC");
    	System.out.println("Message : " + custC.getMessage());
    }
}