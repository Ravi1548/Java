package com.nissan.bean;

import java.util.Scanner;

public class AverageOfStudents {

	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  //user input
	  System.out.println("Enter the marks of 10 students");
	  int[] arrayOfMarks = new int[10];
	  
	  //looping
	  for(int i =0;i<10;i++) {
		  arrayOfMarks[i] = scanner.nextInt();
	  }
	  
	  //Calculation
	  int sumOfMarks = 0;
	  int avgOfMarks = 0;
	   for(int i= 0;i<10;i++) {
		   sumOfMarks = sumOfMarks + arrayOfMarks[i] ;
		   avgOfMarks = sumOfMarks/10;   
	   }
	   
	   //printing the average marks
	   System.out.println("Average Marks of student is " + avgOfMarks);

	}

}
