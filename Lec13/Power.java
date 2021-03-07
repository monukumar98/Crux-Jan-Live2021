package Lec13;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 5));

	}
 public static int power(int a, int b) {
	 // Base Case
	 if(b==0) {
		 return 1;
	 }
	 return a*power(a, b-1);
 }
}
