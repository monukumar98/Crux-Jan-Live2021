package Lec31;

import Lec29.Linkedlist;

public class Merge_Sort_Linked {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
//		ll.addlast(20);
//		ll.addlast(10);
//		ll.addlast(20);
//		ll.addlast(50);
//		ll.addlast(900);
//		ll.addlast(2);
//		ll.Display();
//		ll.meregsort();
//		ll.Display();
		ll.addlast(1);
		ll.addlast(2);
		ll.addlast(3);
		ll.addlast(4);
		ll.addlast(5);
		ll.addlast(6);
		ll.addlast(7);
		ll.addlast(8);
		ll.CreateCycle();
		System.out.println(ll.FlodCycleDection());
		// ll.Cycleremove2();
		ll.FloydCycleRemoval();
		System.out.println(ll.FlodCycleDection());
		ll.Reverse_Nodes_in_k_Group(3);
		ll.Display();
	}

}
