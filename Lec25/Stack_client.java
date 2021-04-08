package Lec25;

public class Stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		//s.push(60);
		s.Display();
	//	System.out.println(s.peek());
		//System.out.println(s.size());
		s.Display();
		System.out.println(s.pop());
		//System.out.println(s.size());
		s.Display();
		System.out.println(s.pop());
	//	System.out.println(s.size());
		s.Display();
		System.out.println(s.pop());
	//	System.out.println(s.size());
		s.Display();
		System.out.println(s.pop());
	//	System.out.println(s.size());
		s.Display();
		System.out.println(s.pop());
		//System.out.println(s.size());
		s.Display();
		System.out.println(s.pop());

	}

}
