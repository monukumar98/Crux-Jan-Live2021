package Lec4;

import java.util.Scanner;

public class Oct_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans =0;
		int mul = 1;
		// src 8 dis 10
		while(n>0) {
			int rem = n%10;
			ans = ans + rem*mul;
			mul= mul*8;
			n=n/10;
		}
		System.out.println(ans);

	}

}
