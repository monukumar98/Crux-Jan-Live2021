package Lec1;

import java.util.Arrays;

public class HouseRobber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		int n = arr.length;
		System.out.println(houserobber(arr, arr.length - 1));
		int dp[] = new int[n];
		Arrays.fill(dp, -1);
		System.out.println(houserobberTD(arr, n - 1, dp));
		System.out.println(houserobberBU(arr));
		System.out.println(houserobberBU_Space_Op(arr));

	}

	public static int houserobber(int[] arr, int n) {

		if (n == 1) {
			return Math.max(arr[0], arr[1]);
		}
		if (n == 0) {
			return arr[0];
		}
		int house_2 = houserobber(arr, n - 2);
		int house_1 = houserobber(arr, n - 1);
		return Math.max(house_2 + arr[n], house_1);
	}

	public static int houserobberTD(int[] arr, int n, int dp[]) {

		if (n == 1) {
			return Math.max(arr[0], arr[1]);
		}
		if (n == 0) {
			return arr[0];
		}
		if (dp[n] != -1) {
			return dp[n];
		}
		int house_2 = houserobberTD(arr, n - 2, dp);
		int house_1 = houserobberTD(arr, n - 1, dp);
		dp[n] = Math.max(house_2 + arr[n], house_1);
		return dp[n];
	}

	public static int houserobberBU(int[] arr) {
		int [] dp = new int [arr.length];
		dp[0]=arr[0];
		dp[1]=Math.max(arr[0], arr[1]);
		for (int i = 2; i <arr.length; i++) {
			int house_2 = dp[i - 2];
			int house_1 = dp[i- 1];
			dp[i]= Math.max(house_2 + arr[i], house_1);
			
		}
		return dp[arr.length-1];
		

	}
	public static int houserobberBU_Space_Op(int[] arr) {
		int first = arr[0];
		int sec =Math.max(arr[0], arr[1]);
		for (int i = 2; i <arr.length; i++) {
			int third = Math.max(first+ arr[i], sec);//i==2
			first=sec;
			sec=third;
		}
		return Math.max(first, sec);
		
	}
	
}
