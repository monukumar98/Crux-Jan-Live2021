package Lec27;

public class Client_Stack_using_Queue {
	public static void main(String[] args) throws Exception {
		Stack_Using_Queue qs = new Stack_Using_Queue();
		qs.push(90);
		qs.push(20);
		System.out.println(qs.pop());
		System.out.println(qs.size());
		for (int i = 1; i <=7; i++) {
			qs.push(10*i);
			qs.Display();
		}
		
	}
}
