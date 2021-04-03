package Lec23;

public class Max_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr = {2,3,-1,8,-13,9};
         System.out.println(max_Sum(arr));
	}
	// O(N)
	public static int max_Sum(int [] arr) {
		int ans = Integer.MIN_VALUE;
		int curr_sum=0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum+=arr[i];
			ans=Math.max(curr_sum, ans);
			if(curr_sum<0) {
				curr_sum=0;
			}
		}
		return ans;
	}

}
