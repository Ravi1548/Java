package com.nissan.app;
import java.util.*;
import com.nissan.bean.Customer;
public class BankApp {

	public static void main(String[] args) {
		
		//declare variables
		Scanner input = new Scanner(System.in);
		
		//get input from the user
		String[] customerNames = new String[20];
		double[] openingBalances = new double[20];
		
		//choice
		char choice = 'n';
		String enterCustomerName = "";
		int counter = 0;
		
		//menu driven
		do {
			System.out.println("Enter Customer Name");
			enterCustomerName = input.nextLine();
			
			if(Customer.checkCustomerExists(enterCustomerName,customerNames)) {
				System.out.println("Customer Already Exists!!");
				continue;
			}
			else {
				customerNames[counter] = enterCustomerName;
			}
			
			//other details
			System.out.println("Enter Bank Balance : ");
			openingBalances[counter] = Double.parseDouble(input.nextLine());
			counter++;
			
			//Do you want to continue
			System.out.println("Do you want to enter more (y/n):");
			choice = input.nextLine().charAt(0);
		}while(choice == 'y' || choice == 'Y');

	}
	
//	public static boolean checkCustomerExists(String customerName, String[] customerNames){
//		//check condition
//		for(String customer : customerNames) {
//			if(customerName.equals(customer)) {
//				return true;
//			}
//		}
//		
//		
//		return false;
//	}


}
