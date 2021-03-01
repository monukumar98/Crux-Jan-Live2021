package Doubt_class_2_live;

public class fib {
	public static void main(String[] args) {
		int num = 5;
		int a = 0, b = 0, c = 0;
		for (int row = 1; row <= num; row++) {
			for (int i = 1; i <= row; i++) {
				c = a + b;
				System.out.print(c+ " ");
				if (c == 0) {
					a = 1;
				}
				b = a;
				a = c;
			}
			System.out.println();
		}
	}
}
