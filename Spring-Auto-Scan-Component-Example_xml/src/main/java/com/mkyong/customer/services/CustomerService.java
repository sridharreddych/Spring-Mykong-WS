package com.mkyong.customer.services;

import com.mkyong.customer.dao.CustomerDAO;

public class CustomerService
{
	CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}

}