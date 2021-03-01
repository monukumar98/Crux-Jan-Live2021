package Doubt_class_2_live;

public class any_to_any {
	public static void main(String[] args) {
		int num = 101;
		int src = 2;
		int dst = 10;
		int a = change_base(num,10,src);
		int b = change_base(a, dst, 10);
//		System.out.println(a);
		System.out.println(b);
		
	}
	public static int change_base(int num, int div, int mult) {
		int ans = 0;
		int temp = 1;
		while (num > 0) {
			int digit = num % div;
			ans = ans + digit * temp;
			num = num / div;
			temp = temp * mult;
		}
		return ans;
	}
}
