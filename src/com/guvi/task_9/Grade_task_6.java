package com.guvi.task_9;

import java.util.Scanner;

public class Grade_task_6 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int month = scanner.nextInt(); 
	        double rent = scanner.nextDouble(); 
	        int days = scanner.nextInt(); 
	        double tariff = 0; // 
	       
	        if (month < 1 || month > 12 || rent < 0 || days < 0) {
	            System.out.println("Invalid Input");
	        } else {
	           
	            if (month >= 4 && month <= 6 || month >= 11 && month <= 12) {
	                
	                tariff = rent * days * 1.2;
	            } else {
	                
	                tariff = rent * days;
	            }
	           
	            System.out.printf("%.2f", tariff);
	        }
	    }
	}

