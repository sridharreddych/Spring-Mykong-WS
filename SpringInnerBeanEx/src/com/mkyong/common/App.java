package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
    	/*ApplicationContext context =
    	    	  new ClassPathXmlApplicationContext("SpringBeans.xml");*/
    	/*ApplicationContext context =
    	  new ClassPathXmlApplicationContext("Inner-Bean.xml"); */
    	ApplicationContext context =
    	    	  new ClassPathXmlApplicationContext("InnerBean-Using-Constrctor.xml");
    /*	ApplicationContext context =
    	    	  new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});*/

    	Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println(cust);

    }
}