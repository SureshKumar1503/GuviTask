package com.guvi.task_9;

import java.util.Scanner;

public class Task_2_reverse {

	public static void main(String[] args) {
          String reverseStr = "";
	    
	    Scanner sc = new Scanner(System.in);
	  
	   System.out.println("Enter a string:");
	   String str = sc.nextLine();
	   int strLength = str.length();
	   
	   
	    System.out.println(str.length());

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i); //
	    }
       System.out.println(reverseStr);
	    
	  
	}

}
