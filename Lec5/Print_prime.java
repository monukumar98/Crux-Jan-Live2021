package Lec5;


public class Print_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=2; i<=n; i++) {
			if(Check_prime(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean Check_prime(int n) {
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
              return false;
			}
			i++;
		}
		return true;
	}
}
