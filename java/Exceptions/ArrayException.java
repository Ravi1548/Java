package com.nissan.app;

import java.util.Scanner;

public class ArrayException {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {

			// creates an array
			int number = 10;
			int[] array = new int[number];
			System.out.println("Enter the elements of the array: ");
			for (int i = 0; i <= number; i++) {
				array[i] = scanner.nextInt();
			}
			
			

		} catch (ArrayIndexOutOfBoundsException ao) {
			System.out.print("Sorry! you crossed the limit");
		}

	}
}
