package Lec25;

public class Queue {

	protected int[] data;
	protected int front;
	protected int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean is_empty() {
		return this.size() == 0;
	}

	public boolean is_full() {
		return this.size() == this.data.length;
	}

	public void Enqueue(int item) throws Exception {
		if (is_full()) {
			throw new Exception("Queue is Full");
		}
		int i = (this.size + this.front) % this.data.length;
		this.data[i] = item;
		this.size++;
	}

	public int Dequeue() throws Exception {
		if (is_empty()) {
			throw new Exception("Queue is Empty");
		}
		int item = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return item;
	}

	public int get_Front() {
		int item = this.data[this.front];
		return item;
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (this.front + i) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
		System.out.println();
	}

}
