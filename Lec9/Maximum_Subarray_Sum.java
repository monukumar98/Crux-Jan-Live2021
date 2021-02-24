package Lec9;

import java.util.Scanner;

public class Maximum_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(Max_Sub_Sum(arr));
		System.out.println(Max_Sub_Sum_2(arr));


	}
	public static int  Max_Sub_Sum(int []arr) {
		int ans = Integer.MIN_VALUE;
		int p=0;
		int q=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum=0;
				for(int k=i; k<=j; k++) {
					sum+=arr[k];
				}
//				ans=Math.max(ans, sum);
				if(sum>ans) {
					ans=sum;
					p=i;
					q=j;
				}
			}
		}
		for (int i = p; i <=q; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return ans;
	}
	public static int  Max_Sub_Sum_2(int []arr) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum =0;
			for (int j = i; j < arr.length; j++) {
				sum +=arr[j];
				if(sum>ans) {
					ans=sum;
					
				}
			}
		}
		
		return ans;
	}

}
