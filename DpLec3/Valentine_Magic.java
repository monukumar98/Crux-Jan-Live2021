package Lec3;

import java.util.*;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m  = sc.nextInt();
		int[] boys = new int[n];
		for (int i = 0; i < boys.length; i++) {
			boys[i] = sc.nextInt();

		}
		int girls[] = new int [m];
		for (int i = 0; i < girls.length; i++) {
			girls[i]=sc.nextInt();
		}
		int [][] dp  = new int [n][m];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j]=-1;
			}
		}
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(ValentineMagic(boys, girls, 0, 0,dp));
		

	}
	public static int ValentineMagic(int [] boys, int [] girls, int i, int j, int [][] dp) {
		if(i==boys.length) {
			return 0;
		}
		if(j==girls.length) {
			return 1000000;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int gs = Math.abs(boys[i]-girls[j]) + ValentineMagic(boys, girls, i+1, j+1,dp);
	    int gr = ValentineMagic(boys, girls, i, j+1,dp);
	    return dp[i][j]=Math.min(gs, gr);
		
		
		
	}

}
