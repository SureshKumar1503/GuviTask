package com.guvi.task_10;

import java.util.Scanner;

public class Account_Q4 {
	

	
	    private double balance;

	    public Account_Q4() {
	        this.balance = 0.0;
	    }

	    public Account_Q4(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void withdraw() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the withdrawal amount: ");
	        double amount = scanner.nextDouble();

	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Remaining balance: " + balance);
	        } else {
	            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
	        }
	    }

	    public void deposit() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the deposit amount: ");
	        double amount = scanner.nextDouble();

	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. Updated balance: " + balance);
	        } else {
	            System.out.println("Deposit failed. Please deposit a valid amount.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public static void main(String[] args) {
	        Account_Q4 account1 = new Account_Q4(); // Using default constructor
	        Account_Q4 account2 = new Account_Q4(100.0); // Using constructor with an argument

	        System.out.println("Initial balance of account1: " + account1.getBalance());
	        System.out.println("Initial balance of account2: " + account2.getBalance());

	        account1.deposit();
	        account1.withdraw();

	        account2.deposit();
	        account2.withdraw();
	    }
	}
