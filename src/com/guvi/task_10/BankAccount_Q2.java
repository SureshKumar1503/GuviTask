package com.guvi.task_10;


	public class BankAccount_Q2 {
	    private double balance;

	 
	    public BankAccount_Q2() {
	        this.balance = 0.0; 
	    }

	    public BankAccount_Q2(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	   
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount. Please enter a positive amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }

	    public static void main(String[] args) {
	       
	        BankAccount_Q2 account1 = new BankAccount_Q2();
	        System.out.println("Account 1 - Initial Balance: " + account1.getBalance());
	        account1.deposit(100.0);
	        account1.withdraw(50.0);

	       
	        BankAccount_Q2 account2 = new BankAccount_Q2(500.0);
	        System.out.println("\nAccount 2 - Initial Balance: " + account2.getBalance());
	        account2.deposit(200.0);
	        account2.withdraw(300.0);
	    }
	}


