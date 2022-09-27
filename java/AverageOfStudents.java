package com.nissan.bean;

import java.util.Scanner;

public class AverageOfStudents {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int n;
	  
	  System.out.println("Enter the marks of 10 students");
	  int[] array = new int[10];
	  
	  for(int i =0;i<10;i++) {
		  array[i] = sc.nextInt();
	  }
	  //Calculation
	  int sum = 0;
	  int avg = 0;
	   for(int i= 0;i<10;i++) {
		    sum = sum + array[i] ;
		    avg = sum/10;   
	   }
	   
	   System.out.println("Average Marks of student is " + avg);

	}

}
