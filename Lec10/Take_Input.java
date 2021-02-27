package Lec10;

import java.util.Scanner;

public class Take_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col = sc.nextInt();
		int  [] []arr = new int [row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			//int [] a = arr[i];
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int [] []ans = new int [3][];
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		System.out.println(ans[2]);
		
		

	}

}
