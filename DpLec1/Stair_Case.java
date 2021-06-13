package Lec1;

public class Stair_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		int dp[] = new int[n + 1];
		System.out.println(StairCaseBU(n));
		System.out.println(StairCaseTD(n, dp));// o(N)

		System.out.println(StairCase(n));// O(2^n)

	}

	private static int StairCase(int n) {
		// TODO Auto-generated method stub
		if (n == 0 || n == 1) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}

		int step1 = StairCase(n - 1);
		int step2 = StairCase(n - 2);
		return step1 + step2;

	}

	private static int StairCaseTD(int n, int dp[]) {
		// TODO Auto-generated method stub
		if (n == 0 || n == 1) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		// dp
		if (dp[n] != 0) {
			return dp[n];
		}

		int step1 = StairCaseTD(n - 1, dp);
		int step2 = StairCaseTD(n - 2, dp);
		dp[n] = step1 + step2;
		return dp[n];

	}

	private static int StairCaseBU(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];

		}
		return dp[n];

	}
}
