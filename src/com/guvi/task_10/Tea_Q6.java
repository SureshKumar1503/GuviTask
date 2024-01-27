package com.guvi.task_10;

import java.util.Scanner;

public class Tea_Q6 {
    // Data members
    private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

    // Constructor
    public  Tea_Q6() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }

    // Method to prepare basic tea with hot water and tea leaves
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Tea is being prepared with hot water and tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Tea is already prepared.");
        }
    }

    // Method to add milk to the tea
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

    // Method to add sugar to the tea
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
}

// Subclass for Black Tea
class BlackTea extends Tea_Q6 {
    @Override
    public void prepareTea() {
        super.prepareTea();
        System.out.println("Adding black tea leaves and brewing for 5 minutes.");
    }
}

// Subclass for Green Tea
class GreenTea extends Tea_Q6 {
    @Override
    public void prepareTea() {
        super.prepareTea();
        System.out.println("Adding green tea leaves and brewing for 3 minutes.");
    }
}

// Subclass for Herbal Tea
class HerbalTea extends Tea_Q6 {
    @Override
    public void prepareTea() {
        super.prepareTea();
        System.out.println("Adding herbal tea blend and brewing for 7 minutes.");
    }
}

// Main method (for testing)
class TeaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create objects of the subclasses
        BlackTea blackTea = new BlackTea();
        GreenTea greenTea = new GreenTea();
        HerbalTea herbalTea = new HerbalTea();

        System.out.println("Preparing Black Tea:");
        blackTea.prepareTea();
        blackTea.addMilk();
        blackTea.addSugar();

        System.out.println("\nPreparing Green Tea:");
        greenTea.prepareTea();
        greenTea.addMilk();
        greenTea.addSugar();

        System.out.println("\nPreparing Herbal Tea:");
        herbalTea.prepareTea();
        herbalTea.addMilk();
        herbalTea.addSugar();

        // Close the scanner
        scanner.close();
    }
}


