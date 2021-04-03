package Lec23;

public class Sqrt_of_PrmeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(is_prime(11));
	

	}
 public static boolean is_prime(int n) {
	 int div=2;
	 while(div*div<=n) {
		 if(n%div==0) {
			 return false;
		 }
		 div++;
	 }
	 return true;
 }
}
