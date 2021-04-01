package Live_Jan_doubt;

import java.util.Scanner;

public class Max_sum_two_arr {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-->0) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] arr1 = new int[n];
			for(int i=0;i<n;i++) {
				arr1[i]=scn.nextInt();
			}
			int[] arr2 = new int[m];
			for(int i=0;i<m;i++) {
				arr2[i]=scn.nextInt();
			}
			int P1 = 0;
			int P2 = 0;
			int sum1 =0;
			int sum2 =0;
			int ans =0;
			while(P1<n && P2<m) {
				if(arr1[P1]==arr2[P2]) {
//					System.out.println(sum1+" "+sum2+ " "+arr1[P1]);
					ans = ans + arr1[P1]+Math.max(sum1, sum2);
					P1++;
					P2++;
					sum1=0;
					sum2=0;
					
				}
				else if(arr1[P1]<arr2[P2]) {
					sum1+= arr1[P1];
					P1++;
				}
				else {
					sum2+= arr2[P2];
					P2++;
				}
			}
			while(P1<n) {
				sum1 = sum1+arr1[P1];
				P1++;
			}
			while(P2<m) {
				sum2 = sum2+arr2[P2];
				P2++;
			}
			System.out.println(ans+Math.max(sum1, sum2));
		}
	}
}
