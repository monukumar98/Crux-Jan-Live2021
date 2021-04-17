package Lec29;

public class Min_Stack_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack ms = new MinStack();
		ms.push(10);
		ms.push(5);
		ms.push(7);
		ms.push(2);
		ms.push(4);
		ms.push(6);
		ms.push(8);
		ms.push(9);
		ms.push(1);
		ms.push(11);
		int n = ms.size();
		for (int i = 0; i < n; i++) {
			System.out.println(ms.min());
			System.out.println(ms.pop());
			System.out.println("........");
		}

		System.out.println(ms.size());

	}

}
