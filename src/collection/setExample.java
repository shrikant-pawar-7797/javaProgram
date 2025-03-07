package collection;

import java.util.HashSet;
import java.util.Set;

public class setExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set= new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Apple");    // // Duplicate, won't be added
		
		System.out.println(set);  // [Apple, Banana] (unordered)
 

	}

}
