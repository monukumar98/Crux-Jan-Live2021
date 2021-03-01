package Doubt_class_2_live;

public class chew {
	public static void main(String[] args) {

		int num = 10;
		int mult = 1;
		int ans = 0;
		while(num>0) {
			int digit = num %10;
			if(9-digit<=digit) {
				digit = 9-digit;
			}
			if(num<10 && digit==0) {
				digit=9;
			}
			ans = ans + digit*mult;
			num= num/10;
			mult=mult*10;
		}
		System.out.println(ans);
	}
}
