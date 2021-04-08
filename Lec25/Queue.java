package Lec25;

public class Queue {
	private int[] data;
	private int front;
	private int size;

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

	public void Enqueue(int item) {

		this.data[this.size] = item;
		this.size++;
	}

	public int Dequeue() {

		int item = this.data[this.front];
		this.data[this.front] = 0;
		this.front++;
		this.size--;
		return item;
	}

	public int get_Front() {
		int item = this.data[this.front];
		return item;
	}

}
