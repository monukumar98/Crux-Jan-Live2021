package Lec2;

public class Inverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32145;
		int ans =0;
		int index=1;
		while(n>0) {
			int rem = n%10;
			int pow = (int) Math.pow(10, rem-1);
			ans = ans + index*pow;
			n = n/10;
			index++;
		}
		System.out.println(ans);

	}

}
