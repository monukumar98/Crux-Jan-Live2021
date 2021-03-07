package Lec13;

public class Print_Incre {
	public static void main(String[] args) {
     PI(5);
	}

	public static void PI(int n) {
		// Base Case
		if (n == 0) {
			return;
		}
      // Head Recursion 
		PI(n - 1);// smaller problem
		// self work
		System.out.println(n);

	}
}
