package Lec30;

import Lec29.Linkedlist;

public class Merge_two_Sorted_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
		ll.addlast(95);
		ll.addlast(7);
		ll.addlast(19);
		ll.addlast(11);
		ll.addlast(13);
		ll.addlast(15);
		//ll.Display();
		Linkedlist ll1 = new Linkedlist();
		ll.Display();
		ll.meregsort();
		ll.Display();
		ll1.addlast(2);
		ll1.addlast(4);
		ll1.addlast(6);
		ll1.addlast(8);
		ll1.addlast(21);
		ll1.addlast(90);
		ll1.Display();
		ll.merge(ll1);
		ll.Display();
		System.out.println(ll.mid());

	}

}
