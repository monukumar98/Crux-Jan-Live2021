package Doubt_class_2_live;

import java.util.Scanner;

public class cal_2 {
	public static void main(String[] args) {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		while (true) {
			char ch = sc.next().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				if (ch == '+') {
					int sum = n1 + n2;
					System.out.println(sum);
				} else if (ch == '-') {
					int m = n1 - n2;
					System.out.println(m);
				} else if (ch == '*') {
					int pr = n1 * n2;
					System.out.println(pr);
				} else if (ch == '/') {
					int dd = n1 / n2;
					System.out.println(dd);
				} else if (ch == '%') {
					int mod = n1 % n2;
					System.out.println(mod);
				}
			} else {
				System.out.println("Invalid operation. Try again.");
			}
		}
	}

}
