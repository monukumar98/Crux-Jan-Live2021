package Lec6;

import java.util.Scanner;

public class Max_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max = max_arr(arr);
		System.out.println(max);
		System.out.println(max_Index(arr));

	}
	public static int max_arr(int []arr) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
		
	}
	public static int max_Index(int []arr) {
		int max=Integer.MIN_VALUE;
		int idx=0;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				idx=i;
			}
		}
		return idx;
		
	}

}
