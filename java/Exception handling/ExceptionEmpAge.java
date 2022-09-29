package com.nissan.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEmpAge {

	public static void main(String[] args) {

		try {
			
			//Creating Scanner class
			Scanner scanner = new Scanner(System.in);

			//Taking user input
			System.out.print("Enter employer name");
			String name = scanner.next();

			System.out.print("Enter Age");
			int empAge = scanner.nextInt();

            //Validations
			if (empAge < 18 || empAge > 60) {
				throw new Exception();

			}

		}
             //Catching Exceptions
		catch (Exception ex) {
			System.out.println(" Sorry ! Enter b/w 18-60");
		}

	}
}
