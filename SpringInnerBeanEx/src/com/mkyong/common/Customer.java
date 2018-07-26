package com.mkyong.common;

public class Customer
{
	
	/* Default constructor initially not given so failed with reason Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'CustomerBean' defined in class path resource [SpringBeans.xml]: Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Could not instantiate bean class [com.mkyong.common.Customer]: No default constructor found; nested exception is java.lang.NoSuchMethodException: com.mkyong.common.Customer.<init>() */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Person person;

	public Customer(Person person) {
		this.person = person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
}