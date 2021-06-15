package Lec2;

public class KnapSack_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 10,20,30 };
		int[] val = { 60,100,120 };
		int w = 50;
		System.out.println(Knapsack(wt, val, w, 0));
		int dp [][] = new int [wt.length+1][w+1];
		System.out.println(KnapsackTD(wt, val, w, 1,dp));
		System.out.println(KnapsackBU(wt, val, w, wt.length));

	}

	public static int Knapsack(int[] wt, int[] val, int w, int i) {
		if (i == wt.length || w == 0) {
			return 0;

		}

		int inc = 0;
		int exc = 0;
		if (w >= wt[i]) {
			inc = val[i] + Knapsack(wt, val, w - wt[i], i + 1);
		}
		exc += Knapsack(wt, val, w, i + 1);
		return Math.max(inc, exc);
	}
	public static int KnapsackTD(int[] wt, int[] val, int w, int i,int [][]dp) {
		if (i > wt.length || w == 0) {
			return 0;

		}
		if(dp[i][w]!=0) {
			return dp[i][w];
		}
		int inc = 0;
		int exc = 0;
		
		if (w >= wt[i-1]) {
			inc = val[i-1] + KnapsackTD(wt, val, w - wt[i-1], i + 1,dp);
		}
		exc += KnapsackTD(wt, val, w, i + 1,dp);
		return dp[i][w]= Math.max(inc, exc);
	}
	public static int KnapsackBU(int wt[],int val[],int w, int n) {
		int dp [][] = new int [n+1][w+1];
		for (int i = 1; i <=n; i++) {// index
			for (int j = 1; j <=w; j++) {// W
				int inc = 0;
				int exc = 0;
				if(j>=wt[i-1]) {
					inc = val[i-1]+ dp[i-1][j- wt[i-1]];
				}
				exc+=dp[i-1][j];
				dp[i][j]= Math.max(inc, exc);
			}
		}
		return dp[n][w];

	}

}
