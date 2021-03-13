package Lec15;

public class Last_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,70,5,90,5,6,56,5,5};
		System.out.println( last_Occ(arr, arr.length-1,5));

	}

	public  static int  last_Occ(int[] arr, int i, int k) {
		// TODO Auto-generated method stub
		// Base Case
		if(i<0) {
			return -1;
		}
		if(arr[i]==k) {
			return i;
		}
		return last_Occ(arr, i-1, k);
	}

}
