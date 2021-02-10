package Lec2;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor = 60;
		int divident = 36;
		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;

		}
		System.out.println(divisor);
		

	}

}
