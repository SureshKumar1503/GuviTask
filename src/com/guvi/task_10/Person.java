package com.guvi.task_10;

	public class Person {
	   
	    private String name;
	    private int age;

	   
	    public Person(String name, int age) {
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

	        Person person1 = new Person("Suresh", 29);

	        System.out.println("Person's name: " + person1.getName());
	        System.out.println("Person's age: " + person1.getAge());
	    }
	}


