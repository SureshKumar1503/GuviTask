package com.guvi.task_9;

public class Task3_Num {

	
	    public static void main(String[] args) {
	        int rows = 4;
	        int num = 1;

	        for (int i = 1; i <= rows; i++) {
	           
	            for (int j = rows; j > i; j--) {
	                System.out.print("");
	            }

	            
	            for (int k = 1; k <= i; k++) {
	                System.out.print(num++ + " ");
	            }

	            System.out.println();
	        }
	    }
	}


