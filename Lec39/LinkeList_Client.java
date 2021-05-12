package Lec39;

import java.util.ArrayList;

public class LinkeList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList<Object> ll = new LinkedList<>();
		ll.addlast("pooja");
		ll.addlast("Rahul");
		ll.addlast("rohan");
		ll.addatindex(1, 10);
		ll.Display();
		ArrayList list = new ArrayList();
		list.add("hey");
		list.add(90);
		System.out.println(list);


	}

}
