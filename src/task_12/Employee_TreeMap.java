package task_12;

import java.util.TreeMap;

public class Employee_TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> obj = new TreeMap<Integer, String>();
		
		
		obj.put(101,"Arun");
		obj.put(102,"Bala");
		obj.put(103, "Charu");
		obj.put(104, "Raja");
		obj.put(105,"Noah");
		System.out.println("TreeMap of employee name:"+obj);
		
		System.out.println("TreeMap of employee Name Alphabetical order :");
		
		for(String name:obj.values()) {
		
			System.out.println(name);

	}

}}
