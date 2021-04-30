package Lec33;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(3&2);
		System.out.println(4|3);
		System.out.println(5^3);
		System.out.println(~5);
		oddeven(9);

	}
	public static void oddeven(int n) {
	
		if((n&1)==1) {
			System.out.println("odd");
		}
		else {
			System.out.println("even");
		}
	}

}
