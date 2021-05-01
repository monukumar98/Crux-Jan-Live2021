package Lec34;


import Lec33.Count_setbit;

public class AvG_End_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 999;
		System.out.println(countnumber(n));

	}

	public static int countnumber(int n) {
		int[] arr = { 2, 3, 5 };
		int ans = 0;
		for (int i = 1; i < (1 << arr.length); i++) {
			int countsetbit = Count_setbit.count_fast_setbit(i);
			int res = pattern(n, i, arr);
			if ((countsetbit & 1) == 1) {
				ans += res;
			} else {
				ans -= res;
			}

		}
		return ans;
	}

	private static int pattern(int n, int i, int[] arr) {
		// TODO Auto-generated method stub
		int pos = 0;
		int ans = 1;
		while (i != 0) {
			if ((i & 1) != 0) {
				ans = ans * arr[pos];
			}
			i >>= 1;
			pos++;
		}
		return n / ans;

	}

}
