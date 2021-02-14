package Lec5;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int i =40;
//		System.out.println(i+" "+30+80);
	//	float f = 5.6f;
		System.out.println(5.0/9.0);
		int minf = sc.nextInt();
		int maxf = sc.nextInt();
		int steps = sc.nextInt();
		
		for (int Temp = minf; Temp <= maxf; Temp += steps) {
			int c =   ((5* (Temp - 32))/9);
			System.out.println(Temp + " " + c);

		}

	}

}
