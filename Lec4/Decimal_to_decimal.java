package Lec4;

import java.util.Scanner;

public class Decimal_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans =0;
		int mul = 1;
		// src 10 dis 2
		while(n>0) {
			int rem = n%2;
			ans = ans + rem*mul;
			mul= mul*10;
			n=n/2;
		}
		System.out.println(ans);

	}

}
