package Live_Jan_doubt;

import java.util.Scanner;

public class Class_ass {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		Method 1;
		int[] soln = new int[25];
		soln[0]=2;
		soln[1]=3;
		for(int i=2;i<25;i++) {
			soln[i]=soln[i-1]+soln[i-2];
		}
				
		int Test = scn.nextInt();
		int t=0;
		while(Test-->0) {
			int Q  =scn.nextInt();
			t++;
			System.out.println("#"+t+" : "+soln[Q-1]);
		}
		
//		Method 2
//		fill("", n, 0,'a');
	}
	
	public static void fill(String Perm,int n,int filled ,char last) {
		if(filled==n) {
			System.out.println(Perm);
			return;
		}
		String new_Perm = Perm + 'a';
		fill(new_Perm, n, filled+1,'a');
		if(last=='a') {
			new_Perm = Perm + 'b';
			fill(new_Perm, n, filled+1,'b');
		}
	}
}
