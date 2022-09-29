package com.nissan.app;

import java.util.Scanner;

public class ArrayException {
	public static void main(String[] args) {
         //Creating scanner class
		Scanner scanner = new Scanner(System.in);
		
		try {
			// creates an array of size 10
			int number = 10;	
			int[] array = new int[number];
			
			//User input
			System.out.println("Enter the elements of the array: ");
			for (int i = 0; i <= number; i++) {
				array[i] = scanner.nextInt();
			}
			
			
            //Catching Exceptions
		} catch (ArrayIndexOutOfBoundsException ao) {
			System.out.print("Sorry! you crossed the limit");
		}

	}
}
