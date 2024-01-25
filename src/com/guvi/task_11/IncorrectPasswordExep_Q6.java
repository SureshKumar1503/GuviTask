package com.guvi.task_11;

import java.util.Scanner;


class IncorrectPasswordException extends Exception {

public IncorrectPasswordException(String message) {

 super(message);

}

}

public class IncorrectPasswordExep_Q6 {

public static void main(String[] args) throws IncorrectPasswordException {

 Scanner sc = new Scanner(System.in);

 String correctPassword = "1234";

 System.out.println("Enter your password:");

 String userInput = sc.nextLine();


 

   if (!userInput.equals(correctPassword)) {

     throw new IncorrectPasswordException("Incorrect password entered");

   
   }
   else {
	   System.out.println("Valied Password");
   }   
}}

