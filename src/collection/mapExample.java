package collection;

import java.util.HashMap;
import java.util.Map;

public class mapExample {

	public static void main(String[] args) {

		Map<Integer, String> map= new HashMap<>();
		
		map.put(1, "Shrikant");
		map.put(2, "Shraddha");
		map.put(3, "Prashant");
		map.put(4, "Raghini");
		map.put(5, "Priyanka");
		map.put(5, "Priya");  // Overwrites key 5
		
		System.out.println(map);    // {1=Shrikant, 2=Shraddha, 3=Prashant, 4=Raghini, 5=Priya}

	}

}
