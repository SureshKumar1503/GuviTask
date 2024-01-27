package com.guvi.task_10;

	public class Person_Q1 {
	   
	    private String name;
	    private int age;

	   
	    public Person_Q1(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public static void main(String[] args) {

	        Person_Q1 person1 = new Person_Q1("Suresh", 29);

	        System.out.println("Person's name: " + person1.getName());
	        System.out.println("Person's age: " + person1.getAge());
	    }
	}


