package task_12;

import java.util.ArrayList;

public class RemoveArrayList {

	public static void main(String[] args) {
		ArrayList<String> Stringlist = new ArrayList<String>();
		Stringlist.add("Arun");
		Stringlist.add("Suresh");
		Stringlist.add("Noah");
		Stringlist.add("Siva");
		
		System.out.println("ArrayList before remove:"+ Stringlist);
		
		Stringlist.clear();
		
		
	System.out.println("ArrayList after remove: "+Stringlist);
	}
     
}
