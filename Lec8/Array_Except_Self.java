package Lec8;

import java.util.Arrays;

public class Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,5,3,4,2};
		int [] ans = Except_Self_Method__2(arr);
		//System.out.println(Arrays.toString(ans));
		

	}
	public static int [] Except_Self(int []arr) {
		int []left = new int [arr.length];
		left[0]=1;
		for(int i=1; i<arr.length; i++) {
			left [i]=left[i-1]*arr[i-1];
		}
		int [] right = new int [arr.length];
		right[right.length-1]=1;
		for(int i=right.length-2; i>=0; i--) {
			right[i]= right[i+1]*arr[i+1];
		}
		for (int i = 0; i < right.length; i++) {
			right[i]=right[i]*left[i];
		}
		return right;
	}
	public static int [] Except_Self_Method__2(int []arr) {
		//int arr[]= {6,5,3,4,2};
		int []left = new int [arr.length];
		left[0]=1;
		for(int i=1; i<arr.length; i++) {
			left [i]=left[i-1]*arr[i-1];
		}
		int r =1;
		System.out.println(Arrays.toString(left));
		for(int i=arr.length-1; i>=0; i--) {
			left[i]=left[i]*r;
			
			r= r*arr[i];
			System.out.println(Arrays.toString(left));
			System.out.println(r);
			
		}
		return left;
		
	}

}
