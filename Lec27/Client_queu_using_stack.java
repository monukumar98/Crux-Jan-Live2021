package Lec27;

public class Client_queu_using_stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue_Using_Stack sq = new Queue_Using_Stack();
		for (int i = 1; i <=5; i++) {
			sq.Enqueue(10*i);
			
		}
		System.out.println(sq.Dequeue());
		sq.display();
		System.out.println(sq.size());
		System.out.println(sq.is_empty());

	}

}
