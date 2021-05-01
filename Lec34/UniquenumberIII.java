package Lec34;

import java.util.Arrays;

public class UniquenumberIII {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 3, 5, 3, 5, 5 };
		System.out.println(uniqnumber3(arr));
	}

	public static int uniqnumber3(int[] arr) {
		int ans[] = new int[32];
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int pos = 0;
			while (n != 0) {
				if ((n & 1) == 1) {
					ans[pos]++;
				}
				pos++;
				n >>= 1;
			}
		}
		// System.out.println(Arrays.toString(ans));
		int res = 0;
		int mult = 1;
		for (int i = 0; i < ans.length; i++) {
			ans[i] %= 3;
			res += (ans[i] * mult);

			mult *= 2;
		}
		// System.out.println(Arrays.toString(ans));
		return res;
	}
}
