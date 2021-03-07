package Lec13;

public class Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		print_reverse(arr,arr.length-1);

	}

	public static void print_reverse(int[] arr,int idx) {
		// TODO Auto-generated method stub
		// Base Case
		if(idx<0) {
			return ;
		}
		System.out.print(arr[idx]+" ");
		print_reverse(arr, idx-1);
		
		
	}

}
