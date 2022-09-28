package com.nissan.bean;
import java.util.*;

//  to calculate sum of digits from a string

public class DigitSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//taking input from user
		System.out.println("Enter the number String :- ");
		String inputString = input.nextLine();
		
		// variable to store sum
		int sumOfDigitsinString = 0;
		
		//Looping
		  
		   for (int i = 0; i < inputString.length(); i++) {
		      if(Character.isDigit(inputString.charAt(i))) 
		    sumOfDigitsinString=sumOfDigitsinString+Character.getNumericValue(inputString.charAt(i));
		      }
		   System.out.println("Sum of  the digit present in String : "+ sumOfDigitsinString );
		  }
		
		
	}



