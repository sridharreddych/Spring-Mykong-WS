package com.mkyong.customer.services;

public class CustomerService
{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CustomerService [message=" + message + "]";
	}
	
	
}