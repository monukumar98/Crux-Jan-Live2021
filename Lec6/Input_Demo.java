package Lec6;

import java.util.Scanner;

public class Input_Demo {
     static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = Take_input();
		Display(arr);

	}
	public static int [] Take_input() {
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
//			int e = sc.nextInt();//10
//			arr[i]=e;
			arr[i]=sc.nextInt();
		}
		return arr;//2k
	}
	public static void Display(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
