package Doubt_class_2_live;

import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean start = true;
		while (start) {
			char ch = scn.next().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
//				karo bhai kaam
				int N1 = scn.nextInt();
				int N2 = scn.nextInt();
				calu(N1, N2, ch);
			} else if (ch == 'X' || ch == 'x') {
				break;
			} else {
				System.out.println("Invalid operation. Try again.");
			}
		}
	}

	public static void calu(int a, int b, char ch) {
		if (ch == '+') {
			System.out.println(a+b);
		} else if (ch == '-') {
			System.out.println(a-b);
		} else if (ch == '*') {
			System.out.println(a*b);
		} else if (ch == '/') {
			System.out.println(a/b);
		} else if (ch == '%') {
			System.out.println(a%b);
		}
	}
}
