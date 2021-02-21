package Lec8;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(LinearSearch(arr, 69));

	}
	public static int LinearSearch(int []arr,int item) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}

}
