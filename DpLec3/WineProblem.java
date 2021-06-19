package Lec3;

public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price = { 2, 3, 5, 1, 4 };
		System.out.println(wine(price, 0, price.length - 1, 1));
		int dp[][] = new int[price.length][price.length];
		System.out.println(wineTD(price, 0, price.length - 1, 1, dp));
		System.out.println(wineBU(price));

	}

	public static int wine(int[] price, int i, int j, int year) {
		if (i > j) {
			return 0;
		}
		int fs = year * price[i] + wine(price, i + 1, j, year + 1);
		int ls = year * price[j] + wine(price, i, j - 1, year + 1);
		return Math.max(fs, ls);

	}

	public static int wineTD(int[] price, int i, int j, int year, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int fs = year * price[i] + wineTD(price, i + 1, j, year + 1, dp);
		int ls = year * price[j] + wineTD(price, i, j - 1, year + 1, dp);
		return dp[i][j] = Math.max(fs, ls);

	}

	public static int wineBU(int[] price) {
		int[][] dp = new int[price.length][price.length];
		
		for (int i = 0; i < dp.length; i++) {
			dp[i][i]=price[i]*price.length;
		}
		int year = price.length-1;
		for (int slide = 1; slide < dp.length; slide++) {
			for (int j = slide; j < dp.length; j++) {
				int i = j - slide;
				int fs = price[i] * year + dp[i + 1][j];
				int ls = price[j] * year + dp[i][j - 1];
				dp[i][j]=Math.max(fs, ls);
			}
			year--;

		}
		return dp[0][price.length-1];

	}
}
