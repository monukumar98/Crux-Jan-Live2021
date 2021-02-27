package Lec10;

import java.util.Scanner;

public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr [] [] = new int [r][c];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int x =sc.nextInt();
		System.out.println(Search(arr, x));

	}
	public static int Search(int [] []arr,int x) {
		int row=0;
		int col=arr[0].length-1;
		while(row<arr.length && col>=0) {
			if(arr[row][col]==x) {
				return 1;
			}
			else if(arr[row][col]<x) {
				row++;
			}
			else {
				col--;
			}
		}
		return 0;
		
		
	}

}
