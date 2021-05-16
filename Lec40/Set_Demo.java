package Lec40;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("1");
		set.add("Amit");
		set.add("Rahul");
		set.add("Kunal");
		System.out.println(set);
		System.out.println(set.remove("1"));
		System.out.println(set);
		Set<String> set1 = new TreeSet<>();
		set1.add("1");
		set1.add("Amit");
		set1.add("Rahul");
		set1.add("Kunal");
		System.out.println(set1);
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("1");
		set2.add("Amit");
		set2.add("Rahul");
		set2.add("Kunal");
		System.out.println(set2);

	}

}
