package com.nissan.bean;

public class Customer {

	//check customer exists
	public static boolean checkCustomerExists(String customerName, String[] customerNames){
		//check condition
		for(String customer : customerNames) {
			if(customerName.equals(customer)) {
				return true;
			}
		}
		
		
		return false;
	}
}
