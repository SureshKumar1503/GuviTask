package comp.guvi.task_8;

import java.util.Scanner;

public class FactorialCalcu_Q6 {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to calculate its factorial: ");

	        int number = scanner.nextInt();

	        long factorialResult = calculateFactorial(number);

	        System.out.println("The factorial of " + number + " is: " + factorialResult);

	        scanner.close();
	    }

	    private static long calculateFactorial(int n) {
	        if (n < 0) {
	            System.out.println("Factorial is undefined for negative numbers.");
	            return -1; 
	        } else if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            long factorialResult = 1;
	            for (int i = 2; i <= n; i++) {
	                factorialResult *= i;
	            }
	            return factorialResult;
	        }
	    }
	}


