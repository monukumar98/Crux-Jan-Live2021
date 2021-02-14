package Lec5;

public class Any_to_Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		int ans = Any_to_Dec(3, n);
		System.out.println(ans);
		ans = Dec_to_Any(7, ans);
		System.out.println(ans);

	}
	// Any to dec 
 public static int Any_to_Dec(int src_base, int n) {
	 // src base dis dec
	 int ans =0;
	 int mul =1;
	 while(n>0) {
		 int rem = n%10;
		 ans = ans + rem*mul;
		 mul=mul*src_base;
		 n= n/10;
	 }
	 return ans;
			 
 }
 public static int Dec_to_Any(int dst_base, int n) {
	 // src base dis dec
	 int ans =0;
	 int mul =1;
	 while(n>0) {
		 int rem = n%dst_base;
		 ans = ans + rem*mul;
		 mul=mul*10;
		 n= n/dst_base;
	 }
	 return ans;
 }
}
