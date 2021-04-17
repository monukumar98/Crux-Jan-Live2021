package Lec29;

public class Linked_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
		ll.addlast(100);
		ll.addlast(120);
		ll.addlast(130);
		ll.addlast(10);
		ll.addlast(20);
		ll.addlast(30);
		ll.Display();
		ll.addfirst(40);
		ll.addlast(70);
		ll.Display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getatinndex(0));
		ll.Display();
		ll.addatindex(5, 80);
		ll.Display();
		//System.out.println(ll.removeFirst());
		ll.Display();
	//	System.out.println(ll.removeLast());
		ll.Display();
		System.out.println(ll.removeatindex(4));
		ll.Display();
		
		

	}

}
