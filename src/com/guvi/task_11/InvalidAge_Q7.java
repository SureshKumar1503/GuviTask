package com.guvi.task_11;


	import java.util.Scanner;

	class InvalidAgeException extends Exception {

	  public InvalidAgeException(String message) {

	    super(message);

	  }

	}

	public class InvalidAge_Q7 {

	  public static void main(String[] args) throws InvalidAgeException {

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter your age:");

	
	    int age = sc.nextInt();
	  
	      if (age < 18) {

	        throw new InvalidAgeException("You are not eligible to vote");

	      }
              System.out.println("You are eligible to vote");
	  }}

	  

	


