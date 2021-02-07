package Lec2;

public class Print_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 38682;
		int num =n;
		//2^5
		//int pow= (int) Math.pow(2, 5);
		//System.out.println(pow);
		int counter =0;
		while(num>0) {
			num=num/10;
			counter++;
		}
		//System.out.println(counter);
		int rev =0;
		int mult = (int) Math.pow(10, counter-1);
		while(n>0) {
			int rem = n%10;
		    rev = rev+ rem*mult;
		    n=n/10;
		    mult=mult/10;
		}
		System.out.println(rev);

	}

}
