package Lec10;

import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] [] arr = new int [3][];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// Null Pointer Exception:
		//System.out.println(arr[0][0]);
		//arr[0] = new int [5];
		System.out.println(arr[0]);
//		arr[1]= new int [3];
//		arr[2]=new int [1];
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		for (int i = 0; i < arr.length; i++) {
			int col = sc.nextInt();
			arr[i]= new int [col];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
