package Lec29;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> s;

	private int min;

	public MinStack() {
		// TODO Auto-generated constructor stub
		s = new Stack<>();
		min = 0;
	}

	public void push(int item) {
		if (s.isEmpty()) {
			s.push(item);
			min = item;
		} else {
			if (item >= s.peek()) {
				s.push(item);
			} else {
				// Encr
				int x = 2 * item - min;
				min = item;
				s.push(x);
			}
		}
	}

	public int size() {
		return s.size();
	}

	public int pop() {
		if (s.peek() >= min) {
			return s.pop();
		} else {
			int rv = min;
			min = 2 * min - s.pop();
			return rv;
		}

	}

	public int peek() {
		if (s.peek() >= min) {
			return s.peek();
		} else {
			return min;

		}
	}

	public int min() {
		return min;
	}

}
