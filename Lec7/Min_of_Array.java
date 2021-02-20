package Lec7;

public class Min_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,8,-9,7,90};
		System.out.println(min(arr));
		System.out.println(min_idx(arr));
     
	}
	public static int min(int []arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static int min_idx(int []arr) {
		int min = Integer.MAX_VALUE;
		int j=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
				j=i;
			}
		}
		return j;
	}

}
