package Lec3;

public class Optimal_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 12, 3, 4 };
		System.out.println(optimalGame(arr, 0, arr.length-1 ,new int [arr.length][arr.length]));

	}

	public static int optimalGame(int[] arr, int i, int j, int [][] dp) {
		 if(i>j) {
			 return 0;
		 }
		 if(i+1==j) {
			 return Math.max(arr[i], arr[j]);
		 }
		 if(dp[i][j]!=0) {
			 return dp[i][j];
		 }
		
		
		int op1 = arr[i] + Math.min(optimalGame(arr, i+2, j,dp), optimalGame(arr, i+1, j-1,dp));
		int op2 = arr[j] + Math.min(optimalGame(arr, i+1, j-1,dp), optimalGame(arr, i, j-2,dp));
		return dp[i][j]=Math.max(op1, op2);
		

	}

}
