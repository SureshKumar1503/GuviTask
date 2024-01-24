package com.guvi.task_10;


	public class BankAccount {
	    private double balance;

	 
	    public BankAccount() {
	        this.balance = 0.0; 
	    }

	    // Constructor with two arguments
	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    // Method to get the balance
	    public double getBalance() {
	        return balance;
	    }

	    // Method to deposit an amount into the account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount. Please enter a positive amount.");
	        }
	    }

	    // Method to withdraw an amount from the account
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage:
	        // Creating an account with default balance
	        BankAccount account1 = new BankAccount();
	        System.out.println("Account 1 - Initial Balance: " + account1.getBalance());
	        account1.deposit(100.0);
	        account1.withdraw(50.0);

	        // Creating an account with a specified initial balance
	        BankAccount account2 = new BankAccount(500.0);
	        System.out.println("\nAccount 2 - Initial Balance: " + account2.getBalance());
	        account2.deposit(200.0);
	        account2.withdraw(300.0);
	    }
	}


