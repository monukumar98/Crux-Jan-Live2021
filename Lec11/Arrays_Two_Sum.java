package Lec11;

import java.util.ArrayList;

public class Arrays_Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,5,8,9,11,13,13,15};
		int [] arr1= {4,5,7,8,9,10,13,13,15,17,18};
		int i=arr.length-1;
		int j=arr1.length-1;
		int carry=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i>=0|| j>=0) {
			int sum=carry;
			if(i>=0) {
				sum+=arr[i];
				i--;
			}
			if(j>=0) {
				sum+=arr1[j];
				j--;
			}
			list.add(0, sum%10);
			carry=sum/10;
			
		}
		if(carry!=0) {
			list.add(0,carry);
		}
		System.err.println(list);

	}

}
