package Lec13;

public class Max_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,70,8,90,12,34,56};
		System.out.println(max(arr, 0, Integer.MIN_VALUE));

	}
	public static int max(int []arr,int idx,int ans) {
		// Base Case
		if(idx==arr.length) {
			return ans;
		}
		if(ans<arr[idx]) {
			ans = arr[idx];
			
		}
		return max(arr,idx+1,ans);
		 
		
	}

}
