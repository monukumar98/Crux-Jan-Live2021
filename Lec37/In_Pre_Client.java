package Lec37;

public class In_Pre_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = { 4, 8, 2, 5, 1, 6, 3, 7 };
		int[] post = { 8, 4, 5, 2, 6, 7, 3, 1 };
		In_order_Post_Order_Tree_Bulid ip= new In_order_Post_Order_Tree_Bulid(in, post);
		ip.display();

	}

}
