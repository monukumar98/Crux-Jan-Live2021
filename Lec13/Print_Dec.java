package Lec13; 
public class Print_Dec{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PD(5);

	}
	public static void PD(int n) {
		// Base Case 
		if(n==0) {
			return;
		}
		// Tail Recursion 
		// self work
		System.out.println(n);
		PD(n-1);// smaller problem
		
		
	}

}
