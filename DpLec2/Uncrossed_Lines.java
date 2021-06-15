package Lec2;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int UncrossedLines(int []arr1,int []arr2) {
		int[][] dp = new int[arr1.length + 1][arr2.length + 1];
		for (int i = 1; i <=arr1.length; i++) {
			for (int j = 1; j <=arr2.length; j++) {
				if(arr1[i-1]==arr2[j-1]) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
				
			}
		}
		return dp[arr1.length][arr2.length];
	}

}
