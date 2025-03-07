package collection;

import java.util.ArrayList;
import java.util.List;

public class listExample {

	public static void main(String[] args) {
		
		
		 List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Apple");  // Allows duplicates
	        list.add("Mango");
	        
	        System.out.println(list);  // [Apple, Banana, Apple, Mango]
		
		    list.remove(0);
		
		    System.out.println(list);
	}

}
