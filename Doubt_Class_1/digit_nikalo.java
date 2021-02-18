package Doubt_live;

public class digit_nikalo {
	public static void main(String[] args) {
		int num = 123456789;
		int count = 1;
		int odd_sum = 0;
		int even_sum = 0;
		while (num > 0) {
			
			int digit = num % 10;
			num = num / 10;
			if(count%2==0) {
//				even
				even_sum = even_sum+digit;
			}
			else {
//				odd
				odd_sum = odd_sum +digit;
			}
//			System.out.println(digit);++
			count++;
		}
		System.out.println(odd_sum);
		System.out.println(even_sum);
	}
}
