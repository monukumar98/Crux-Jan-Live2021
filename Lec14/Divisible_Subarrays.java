package Lec14;

import java.util.Scanner;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(Good_Subarray(arr, n));
			t--;
		}

	}

	public static long Good_Subarray(int[] arr, int n) {
		int hole[] = new int[n];
		hole[0] = 1;
		int sum = 0;
		for (int i = 0; i < hole.length; i++) {
			sum += arr[i];
			
			// -ve
			if (sum < 0) {
				sum = sum % n;
				sum += n;

			}

			sum %= n;

			hole[sum]++;
		}
		long ans = 0;
		for (int i = 0; i < hole.length; i++) {
			if (hole[i] >= 2) {
				int p = hole[i];
				ans = ans + (p * (p - 1)) / 2;
			}
		}
		return ans;

	}

}
