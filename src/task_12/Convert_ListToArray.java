package task_12;

import java.util.ArrayList;
import java.util.List;

public class Convert_ListToArray {

	public static void main(String[] args) {
		List<String> ListToarray = new  ArrayList<String>();
		ListToarray.add("Hello");
		ListToarray.add("guvi");
		
		String[] array = new String[ListToarray.size()];
		array = ListToarray.toArray(array);
		System.out.println(array);
		
		for(String ArrayList: array) {
			System.out.println(ArrayList);
		}

	}

}
