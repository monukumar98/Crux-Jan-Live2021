package Lec2;

import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2;
		int p=0;
		while(i<n) { // i<=n-1
			if(n%i==0) {
				p=1;
				System.out.println("not prime");
				break;
			}
			i++;
//			if(i==n) {
//				System.out.println("prime");
//			}
	
		}
		if(p==0) {
		System.out.println("prime");
		}
		System.out.println("Bye");
		

	}

}
