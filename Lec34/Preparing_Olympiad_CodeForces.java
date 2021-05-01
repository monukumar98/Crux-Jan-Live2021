package Lec34;

import java.util.Scanner;

import Lec33.Count_setbit;

public class Preparing_Olympiad_CodeForces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int diff[] = new int[n];
		for (int i = 0; i < diff.length; i++) {
			diff[i] = sc.nextInt();
		}
		System.out.println(PreparingOlympiad(n, l, r, x, diff));

	}

	public static int PreparingOlympiad(int n, int l, int r, int x, int[] diff) {
		n = 1 << n;
		int res = 0;
		for (int i = 3; i < n; i++) {
			if (Count_setbit.count_fast_setbit(i) >= 2) {
				if (isitpossible(l, r, x, diff, i)) {
					res++;
				}
			}
		}
		return res;
	}

	private static boolean isitpossible(int l, int r, int x, int[] diff, int i) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int pos = 0;
		int easy = Integer.MAX_VALUE;
		int hard = Integer.MIN_VALUE;
		int sum = 0;
		while (i != 0) {
			if ((i & 1) != 0) {
				sum += diff[pos];

				easy = Math.min(easy, diff[pos]);
				hard = Math.max(hard, diff[pos]);
			}
			pos++;
			i >>= 1;

		}

		return sum >= l && sum <= r && hard - easy >= x;
	}

}
