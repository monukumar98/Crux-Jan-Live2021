package Lec5;

import java.util.Scanner;

public class Function_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("hello");
		System.out.println("Hey");
		// function calling
//		int a = 10;
//		int b = 20;
//		 additon();
		// additonpara(a, b);
		//int c = additonret(a, b);
	//	System.out.println(c);
		System.out.println(additonret(a, b));

		System.out.println("Bye");

	}

	public static void additonpara(int x, int y) {

		int c = x + y;
		if (c == 30)
			return;
		System.out.println(c);

	}

	public static int additonret(int x, int y) {

		int c = x + y;
		// System.out.println(c);
		return c;
	}

	public static void additon() {
		int a = 10;
		int b = 20;

		int c = a + b;
		additonpara(a, b);
		System.out.println(c);
	}

}
