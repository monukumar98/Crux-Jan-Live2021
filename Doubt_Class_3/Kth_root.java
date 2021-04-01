package Live_Jan_doubt;

import java.util.Scanner;

public class Kth_root {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-->0) {
			long n = scn.nextLong();
			int k = scn.nextInt();
			long ans = (long)Math.pow(n, 1.0/k);
			if(Math.pow(n, 1.0/k)-ans >0.999) {
				System.out.println(ans+1);
			}
			else {
				System.out.println(ans);
				
			}
		}
	}
}
