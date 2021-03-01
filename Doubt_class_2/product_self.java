package Doubt_class_2_live;

public class product_self {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		long[] ans = new long[arr.length];
		ans[0] =1;
		long product = 1;
		for(int i=1;i<arr.length;i++) {
			product = product * arr[i-1];
			ans[i] = product;
		}
		disp(ans);
		product = 1;
		for(int i=arr.length-2;i>=0;i--) {
			product = product * arr[i+1];
			ans[i] = ans[i]*product;
		}
		disp(ans);
		
	}
	public static void disp(long[] arr) {
		for(long val: arr) {
			System.out.print(val+ " ");
		}
		System.out.println();
	}
}
