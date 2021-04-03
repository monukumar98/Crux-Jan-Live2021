package Lec23;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power_in_logn(2, 6));
	}

	public static int power_in_logn(int a, int b) {// a^b
		if (b == 0) {
			return 1;
		}
		int ans = power_in_logn(a, b / 2);
		if (b % 2 != 0) {
			return a * ans * ans;
		} else
			return ans * ans;

	}
}
