package Lec26;

public class DynamicStack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Stack ds = new Dynamic_Stack();
		for (int i = 1; i<=20; i++) {
			ds.push(i);
			ds.Display();
			
		}
		for (int i = 1; i<=20; i++) {
			ds.pop();
			ds.Display();
			
		}

	}

}
