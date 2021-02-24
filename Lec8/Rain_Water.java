package Lec8;

import java.util.Scanner;

public class Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t >0) {
		int n  = sc.nextInt();
		int [] arr = new  int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(RainWater(arr));
		t--;
		}

	}

	public static int RainWater(int arr[]) {
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int ans =0;
		left[0]=arr[0];
		right[arr.length-1]=arr[arr.length-1];
		for(int i=1; i<arr.length; i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		for(int i=arr.length-2; i>=0; i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		for (int i = 0; i < right.length; i++) {
			int temp=  Math.min(left[i], right[i]);
			ans = ans + temp-arr[i];
		}
		return ans;

	}

}
