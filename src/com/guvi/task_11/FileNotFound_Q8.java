package com.guvi.task_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound_Q8 {
	

	  public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the file name:");

	    String fileName = sc.nextLine();

	    sc.close();

	    try {

	      File file = new File(fileName);

	      try (Scanner fileReader = new Scanner(file)) {
			while (fileReader.hasNextLine()) {

			    String line = fileReader.nextLine();
			    System.out.println(line);

			  }
		}


	    } catch (FileNotFoundException e) {

	      System.out.println("An error occurred because the file was not found.");

	      e.printStackTrace();

	    }

	  }

	}


