package com.guvi.task_11;

public class Exception_Q5 {
  
	
	    public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3};
	            
	            int result = numbers[5];
	            
	            System.out.println("Result: " + result); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array Index Out of Bounds. Please check the array bounds.");
	        }
	        
	        
	          try {
	                    String str = "Hello";
	                    
	                    char result = str.charAt(10);
	                    
	                    System.out.println("Result: " + result); 
	                } catch (StringIndexOutOfBoundsException e) {
	                    System.out.println("Error: String Index Out of Bounds. Please check the string length.");
	                }
	            }
	        }

	    
	
