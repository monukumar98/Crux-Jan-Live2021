package Lec1;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n = 6;
		int dp [] = new int [n+1];
		System.out.println(fibTD(n,dp));
		System.out.println(fibBU(n));
		

	}
	public static int fib(int n) {
		if(n==0|| n==1) {
			return n;
		}
		
		int fn1 = fib(n-1);
		int fn2 = fib(n-2);
		
		return fn1+fn2;
	}
	public static int fibTD(int n,int []dp) {
		if(n==0|| n==1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int fn1 = fibTD(n-1,dp);
		int fn2 = fibTD(n-2,dp);
		dp[n]=fn1+fn2;
		return dp[n]; 
	}
	public static int fibBU(int n) {
		int []dp = new int [n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2; i<=n; i++) {
			int fn1 = dp[i-1];
			int fn2 = dp[i-2];
			dp[i]=fn1+fn2;
		}
		return dp[n];
		
	}
}
