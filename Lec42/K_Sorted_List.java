package Lec42;

import java.util.ArrayList;

public class K_Sorted_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		
		list.get(0).add(10);
		list.get(0).add(20);
		list.get(0).add(30);
		list.get(1).add(15);
		list.get(1).add(35);
		list.get(2).add(7);
		list.get(2).add(12);
		list.get(2).add(25);
		list.get(3).add(17);
		list.get(3).add(22);
		list.get(3).add(40);
		System.out.println(list);
		

	}

}
