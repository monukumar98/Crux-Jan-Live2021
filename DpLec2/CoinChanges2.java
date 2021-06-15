package Lec2;

public class CoinChanges2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = { 1, 2, 5 };
		int amount = 5;
		System.out.println(coinChanges(coin, amount, coin.length));
		int[][] dp = new int[coin.length + 1][amount + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(coinChangesTD(coin, amount, coin.length, dp));
		System.out.println(coinChangesBU(coin, amount));

	}

	public static int coinChanges(int[] coin, int amount, int idx) {
		if (amount == 0) {
			return 1;
		}
		if (idx == 0) {
			return 0;
		}

		int inc = 0;
		int exe = 0;
		if (amount >= coin[idx - 1]) {
			inc += coinChanges(coin, amount - coin[idx - 1], idx);
		}
		exe += coinChanges(coin, amount, idx - 1);
		return inc + exe;

	}

	public static int coinChangesTD(int[] coin, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == 0) {
			return 0;
		}
		if (dp[idx][amount] != -1) {
			return dp[idx][amount];
		}
		int inc = 0;
		int exe = 0;
		if (amount >= coin[idx - 1]) {
			inc += coinChangesTD(coin, amount - coin[idx - 1], idx, dp);
		}
		exe += coinChangesTD(coin, amount, idx - 1, dp);
		dp[idx][amount] = inc + exe;
		return dp[idx][amount];

	}

	public static int coinChangesBU(int[] coin, int amount) {

		int[][] dp = new int[coin.length + 1][amount + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}

		for (int i = 0; i <= coin.length; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i <= amount; i++) {
			dp[0][i] = 0;
		}
		// Recursion
		for (int i = 1; i <= coin.length; i++) {// idx
			for (int j = 1; j <= amount; j++) {// amount
				int inc = 0;
				int exe = 0;
				if (j >= coin[i - 1]) {
					inc += dp[i][j - coin[i - 1]];
				}
				exe += dp[i - 1][j];
				dp[i][j] = inc + exe;
			}
		}

		return dp[coin.length][amount];

	}

}
