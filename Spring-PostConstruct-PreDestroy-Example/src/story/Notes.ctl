In Spring, you can either implements InitializingBean and DisposableBean interface or specify the init-method and destroy-method in bean configuration file for the initialization and destruction callback function. In this article, we show you how to use annotation @PostConstruct and @PreDestroy to do the same thing.
Note
The @PostConstruct and @PreDestroy annotation are not belong to Spring, it’s located in the J2ee library – common-annotations.jar.
@PostConstruct and @PreDestroy

A CustomerService bean with @PostConstruct and @PreDestroy annotation

By default, Spring will not aware of the @PostConstruct and @PreDestroy annotation. To enable it, you have to either register ‘CommonAnnotationBeanPostProcessor‘ or specify the ‘<context:annotation-config />‘ in bean configuration file,

1. CommonAnnotationBeanPostProcessor

<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor" />

	<bean id="customerService" class="com.mkyong.customer.services.CustomerService">
		<property name="message" value="i'm property message" />
	</bean>

</beans>


2. <context:annotation-config />

<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
	http://www.springframework.org/schema/context
	http://www.springframework.org/schema/context/spring-context-2.5.xsd">

	<context:annotation-config />

	<bean id="customerService" class="com.mkyong.customer.services.CustomerService">
		<property name="message" value="i'm property message" />
	</bean>

</beans>

Run it

package com.mkyong.common;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.services.CustomerService;

public class App
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context =
    	  new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});

    	CustomerService cust = (CustomerService)context.getBean("customerService");

    	System.out.println(cust);

    	context.close();
    }
}

Output

Init method after properties are set : im property message
com.mkyong.customer.services.CustomerService@47393f
...
INFO: Destroying singletons in org.springframework.beans.factory.
support.DefaultListableBeanFactory@77158a:
defining beans [customerService]; root of factory hierarchy
Spring Container is destroy! Customer clean up

The initIt() method (@PostConstruct) is called, after the message property is set, and the cleanUp() method (@PreDestroy) is call after the context.close();

