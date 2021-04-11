package Lec27;

import Lec26.Dynamic_Stack;

public class Stack_Reverse {
	public static void main(String[] args) throws Exception {
		Dynamic_Stack primary = new Dynamic_Stack();
		for (int i = 1; i <= 6; i++) {
			primary.push(10 * i);
		}
		primary.Display();

	//	Dynamic_Stack secondry = new Dynamic_Stack();
	//	reverseStack(primary, secondry);
//		while (!primary.is_empty()) {
//			secondry.push(primary.pop());
//		}
//		primary = secondry;
		Reversewithout_extra_space(primary);
		primary.Display();

	}

	public static void reverseStack(Dynamic_Stack p, Dynamic_Stack s) throws Exception {

		while (!p.is_empty()) {
			s.push(p.pop());
		}

		Dynamic_Stack secondry = new Dynamic_Stack();

		while (!s.is_empty()) {
			secondry.push(s.pop());
		}
		while (!secondry.is_empty()) {
			p.push(secondry.pop());
		}

	}

	public static void Reversewithout_extra_space(Dynamic_Stack primary) throws Exception {
		if (primary.is_empty()) {
			return;
		}

		int item = primary.pop();
		Reversewithout_extra_space(primary);
		insert_bottom(primary, item);
	}

	public static void insert_bottom(Dynamic_Stack primary, int item) throws Exception {
		if (primary.is_empty()) {
			primary.push(item);
			return;
		}
		int pop_item = primary.pop();
		insert_bottom(primary, item);
		primary.push(pop_item);

	}
}
