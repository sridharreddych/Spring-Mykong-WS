package com.mkyong.common;

import java.util.Date;

public class Customer {

	Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Customer [date=" + date + "]";
	}

}

/*Spring example to show you how to inject a “Date” into bean property. 
1. Factory bean

Declare a dateFormat bean, in “customer” bean, reference “dateFormat” bean as a factory bean. The factory method will call SimpleDateFormat.parse() to convert String into Date object automatically.
2. CustomDateEditor

Declares a CustomDateEditor class to convert String into java.util.Date.
And declares another “CustomEditorConfigurer”, to make Spring convert bean properties whose type is java.util.Date.*/