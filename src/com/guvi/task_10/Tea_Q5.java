package com.guvi.task_10;

import java.util.Scanner;

public class Tea_Q5 {
	
	    private boolean isPrepared;
	    private boolean hasMilk;
	    private boolean hasSugar;

	    public Tea_Q5() {
	        this.isPrepared = false;
	        this.hasMilk = false;
	        this.hasSugar = false;
	    }

	    public void prepareTea() {
	        if (!isPrepared) {
	            System.out.println("Tea is being prepared with hot water and tea leaves.");
	            isPrepared = true;
	        } else {
	            System.out.println("Tea is already prepared.");
	        }
	    }

	    public void addMilk() {
	        if (isPrepared && !hasMilk) {
	            System.out.println("Milk is being added to the tea.");
	            hasMilk = true;
	        } else if (!isPrepared) {
	            System.out.println("Tea needs to be prepared first before adding milk.");
	        } else {
	            System.out.println("Milk is already added to the tea.");
	        }
	    }

	    public void addSugar() {
	        if (isPrepared && !hasSugar) {
	            System.out.println("Sugar is being added to the tea.");
	            hasSugar = true;
	        } else if (!isPrepared) {
	            System.out.println("Tea needs to be prepared first before adding sugar.");
	        } else {
	            System.out.println("Sugar is already added to the tea.");
	        }
	    }

	    public static void main(String[] args) {
	        Tea_Q5 tea = new Tea_Q5();

	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Tea Preparation Menu:");
	            System.out.println("1. Prepare Tea");
	            System.out.println("2. Add Milk");
	            System.out.println("3. Add Sugar");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    tea.prepareTea();
	                    break;
	                case 2:
	                    tea.addMilk();
	                    break;
	                case 3:
	                    tea.addSugar();
	                    break;
	                case 0:
	                    System.out.println("Exiting Tea Preparation Menu. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }

	        } while (choice != 0);
	    }
	}


