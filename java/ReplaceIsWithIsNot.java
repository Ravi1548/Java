package com.nissan.bean;

import java.util.Scanner;

public class ReplaceIsWithIsNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//taking values
		System.out.println("Enter the String : ");
		String text = scanner.nextLine();
		
		//converting into array
		String[] arr = text.split(" ");
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].equals("is")) {
				arr[i] = "is not";
			}
		}
		  //converting back to string
		String backString = "";
		for(int i =0;i<arr.length;i++) {
			backString += arr[i];
			backString += " ";
		}
		//Printing the output
		System.out.println("Replaced String is : "+ backString);
		

	}

}
