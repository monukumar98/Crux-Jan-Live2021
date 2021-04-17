package Lec29;
import java.util.LinkedList;
public class LinkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(50);
		System.out.println(ll);
		System.out.println(ll.remove());
		System.out.println(ll.size());
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

	}

}
