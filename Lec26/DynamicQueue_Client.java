package Lec26;

public class DynamicQueue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		for (int i =1; i <=10; i++) {
			dq.Enqueue(i);
			dq.Display();
			
		}
		System.out.println(dq.Dequeue());
		dq.Display();

	}

}
