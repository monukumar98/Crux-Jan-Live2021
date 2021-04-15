package Lec27;

import Lec26.Dynamic_Stack;

public class Queue_Using_Stack {
	private Dynamic_Stack primary;
	private Dynamic_Stack Secondry;

	public Queue_Using_Stack() {
		// TODO Auto-generated constructor stub
		primary = new Dynamic_Stack();
		Secondry = new Dynamic_Stack();
	}

	public boolean is_empty() {
		return primary.is_empty();
	}

	public boolean is_full() {
		return primary.is_full();
	}

	public int size() {
		return primary.size();
	}

	// Enqueue Efficient
	// O(1)
	public void Enqueue(int item) throws Exception {
		primary.push(item);
	}
// O(N)
	public int Dequeue() throws Exception {
		while (this.primary.size() > 1) {
			Secondry.push(primary.pop());
		}
		int rv = primary.pop();
		while (this.Secondry.size() > 0) {
			this.primary.push(Secondry.pop());
		}
		return rv;
	}
	public int get_front() throws Exception {
		while (this.primary.size() > 1) {
			Secondry.push(primary.pop());
		}
		int rv = primary.peek();
		
		while (this.Secondry.size() > 0) {
			this.primary.push(Secondry.pop());
		}
		return rv;
	}

	public void display() throws Exception {
		while (this.primary.size() > 0) {
			Secondry.push(primary.pop());
		}
		while (this.Secondry.size() > 0) {
			System.out.print(this.Secondry.peek() + " ");
			this.primary.push(Secondry.pop());
		}
		System.out.println();
	}

}
