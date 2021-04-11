package Lec27;

import Lec26.DynamicQueue;

public class Reverse_Queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue primary_Queue = new DynamicQueue();
		for (int i = 1; i <= 5; i++) {
			primary_Queue.Enqueue(10 * i);
		}
		primary_Queue.Display();
		revserqueue(primary_Queue);
		primary_Queue.Display();

	}

	public static void revserqueue(DynamicQueue primaryqueue) throws Exception {
		if (primaryqueue.is_empty()) {
			return;
		}

		int item = primaryqueue.Dequeue();
		revserqueue(primaryqueue);
		primaryqueue.Enqueue(item);

	}

}
