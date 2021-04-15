package Lec25;

public class Stack {
	protected int[] data;
	protected int top;

	public Stack() {
		this.data = new int[5];
		top = -1;
	}

	public Stack(int cap) {
		this.data = new int[cap];
		top = -1;
	}

	public boolean is_empty() {
		return this.top == -1;
	}

	public boolean is_full() {
		return this.top == this.data.length - 1;
	}

	public void push(int item) throws Exception {
	
		if (is_full()) {
			throw new Exception("Stack is full");
		}

		this.top++;
		this.data[this.top] = item;
	}

	public int pop() throws Exception {
		if (is_empty()) {
			throw new Exception("Stack is Empty");
		}
		int rd = this.data[this.top];
		this.data[this.top] = 0;
		this.top--;
		return rd;
	}

	public int peek() throws Exception {
		if (is_empty()) {
			throw new Exception("Stack is Empty");
		}
		return this.data[this.top];
	}

	public void Display() {
		
		for (int i = this.top; i >= 0; i--) {
           System.out.print(this.data[i]+"->");
		}
		System.out.println(".");
	}

	public int size() {
		return this.top + 1;
	}

}
