package Lec13;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,70,5,90,5,6,56,5,5};
		System.out.println( first_Occ(arr, 0,5));

	}
	public static int first_Occ(int []arr,int idx,int item) {
		// Base Case
		if(idx==arr.length) {
			return -1;
		}
		if(arr[idx]==item) {
			return idx;
		}
		
		return  first_Occ(arr,idx+1,item);
		 
		
	}


}
