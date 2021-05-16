package Lec40;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// O(1)
		// put
		map.put("Rohan", 30);
		map.put("Mohan", 500);
		map.put("Amit", 35);
		map.put("Pintu", 100);
		System.out.println(map);
//		map.put("Amit", 35);
		System.out.println(map);
		// get
		// O(1)
		System.out.println(map.get("Amit"));
		// containsKey
		// O(1)
		System.out.println(map.containsKey("Rohan"));
		map.put("Vishal", 55);
		System.out.println(map);
//		System.out.println(map.remove("Rohan"));	
//		System.out.println(map);
		Set<String> s = map.keySet();
		System.out.println(s);
		for (String key : s) {
			System.out.println(key + " " + map.get(key));
		}

		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		ArrayList<String> ll = new ArrayList<String>(map.keySet());
		System.out.println(ll);

		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Rohan", 30);
		map1.put("Mohan", 500);
		map1.put("Amit", 35);
		map1.put("Pintu", 100);
        map1.put("Vishal", 55);
		System.out.println(map);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2=new LinkedHashMap<>();
		map2.put("Rohan", 30);
		map2.put("Mohan", 500);
		map2.put("Amit", 35);
		map2.put("Pintu", 100);
		map2.put("Vishal", 55);
        System.out.println(map2);
	}

}
