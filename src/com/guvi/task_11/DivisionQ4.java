package com.guvi.task_11;

import java.util.Scanner;

public class DivisionQ4 {
	
	 public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter two integers:");
	   
	    int num1 = sc.nextInt(); 
	    int num2 = sc.nextInt();

	    sc.close();
    try {

	   	int quotient = num1 / num2;
	    
	      System.out.println("The quotient is " + quotient);
	    
	    } catch (ArithmeticException e) {

	      System.out.println("Cannot divide by zero");

	    }

	  }

	}


