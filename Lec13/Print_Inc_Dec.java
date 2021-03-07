package Lec13;

public class Print_Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PDI(5);
	}

	public static void PDI(int n) {
		// Base Case
		if (n == 0) {
			return;
		}
		// self work
		System.out.println(n);
		PDI(n - 1);// smaller problem
		// self work
		System.out.println(n);

	}

}
