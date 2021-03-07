package Lec13;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(4));

	}

	public static int fib(int n) {

		// Base Case
		if (n == 0 || n == 1) {
			return n;
		}
//		
		return fib(n - 1) + fib(n - 2);

	}

}
