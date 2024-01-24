package com.guvi.task_9;

import java.util.Scanner;

public class Grading_system_5 {
	
	
	    public static void main(String[] args) {
	    	
	    	System.out.println("Enter Student Mark : ");
	        Scanner scanner = new Scanner(System.in);
	        int marks = scanner.nextInt();

	        if (marks > 100) {
	            System.out.println("Invalid Input");
	        } else if (marks >= 90) {
	            System.out.println('S');
	        } else if (marks >= 80) {
	            System.out.println('A');
	        } else if (marks >= 70) {
	            System.out.println('B');
	        } else if (marks >= 60) {
	            System.out.println('C');
	        } else if (marks >= 50) {
	            System.out.println('D');
	        } else if (marks >= 0) {
	            System.out.println('F');
	        } else {
	            System.out.println("Invalid Input");
	            
	        }
	        
	    }
	}


