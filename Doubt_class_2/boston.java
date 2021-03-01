package Doubt_class_2_live;

public class boston {
	public static void main(String[] args) {
		int num = 22;
//		if (sum_di(num) == fac(num)) {
//			System.out.println(1);
//		} else {
//			System.out.println(0);
//
//		}

	}

	public static int sum_di(int num) {
		int ans = 0;
		;
		while (num > 0) {
			ans = ans + num % 10;
			num = num / 10;
		}
		return ans;
	}

	public static int fac(int num) {
		int div = 2;
		int factor_sum = 0;
		while (num > 0 && div <= num) {
			if (num % div == 0) {
//				System.out.println(div );
				factor_sum = factor_sum + sum_di(div);
				num = num / div;
			} else {
				div++;
			}
		}
		return factor_sum;
	}
}
