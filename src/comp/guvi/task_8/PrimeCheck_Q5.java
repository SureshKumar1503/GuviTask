package comp.guvi.task_8;

import java.util.Scanner;

public class PrimeCheck_Q5 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        
	        boolean isPrime = true;
	        
	        if (n < 2) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i * i <= n; i++) {
	                if (n % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        
	        if (isPrime) {
	            System.out.println(n + " is a prime number.");
	        } else {
	            System.out.println(n + " is not a prime number.");
	        }
	    }
	
}

