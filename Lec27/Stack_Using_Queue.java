package Lec27;

import Lec26.DynamicQueue;

public class Stack_Using_Queue {
	private DynamicQueue primay;
	private DynamicQueue secondry;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		primay = new DynamicQueue();
		secondry = new DynamicQueue();

	}

	public boolean is_Empty() {
		return primay.is_empty();
	}

	public boolean is_full() {
		return primay.is_full();
	}

	public int size() {
		return primay.size();
	}

	// O(n)
	public void push(int item) throws Exception {
		secondry.Enqueue(item);
		while (!primay.is_empty()) {
			secondry.Enqueue(primay.Dequeue());
		}
		primay = secondry;
		secondry = new DynamicQueue();
	}

	// pop Efficient o(1)
	public int pop() throws Exception {

		return primay.Dequeue();
	}

	public int peek() {
		int rv = primay.get_Front();
		return rv;
	}

	public void Display() {
		primay.Display();
	}

}
