package Lec22;

public class Time_Complexity {
	public static void main(String[] args) {
		int n = 100000;
//	System.out.println("hey");
//	System.out.println("hey");
//	System.out.println("hey");
//	System.out.println("hey");
//	System.out.println("hey");
		for (int i = 1; i <= n; i++) {
			System.out.println("hey");// (1)
		}
		
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n / 3; j++) {
				System.out.println("Hey");
			}
		}
		
		int i = 0;
		while (i < n) {
			System.out.println("Hey");

			i++;
		}
		while (i < n) {
			System.out.println("Hey");

			i *= 2;
			
			// lon(n)
		}
		
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			
			// lon(n)
		}
		while (i <= n) {
			System.out.println("Hey");

			i += 2;
			i += 3;
			// O(N)
			
		}
		while (i <= n) {
			System.out.println("Hey");

			i *= 2;
			i *= 3;
			
			// long n base 6
		}
		while (n > 0) {
			System.out.println("Hey");

			n /= 2;
			n /= 3;
			// long n base 6
		}
		while (i <= n) {
			System.out.println("Hey");

			i += k;
			
			// O(n/k)
			
		}
		while (i <= n) {
			System.out.println("Hey");

			i *= k;
			// long n base k
		}
		while (n > 0) {
			System.out.println("Hey");

			n = n - 1;
			// O(n)
		}
		while (n > 0) {
			System.out.println("Hey");

			n = n - 2;
			n = n - 3;
			// O(n)
		}
		while (n > 0) {
			n = n - k;
			// O(n/k)
		}
		
		for (i = 1; i <= n; i++) {// n
			for (int j = 1; j <= n; j++) {// n
				System.out.println("hey");
				// O(n^2)
			}
		}
		
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// O(sqrt(n))
		}
		
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= 1000; k++) {
                 // O(1000*N^2)
				}
			}
		
	}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (int k = 1; k <= n / 2; k++) {
					System.out.println("hey");
				}
			}
		}
		
		for (i = 1; i <= n; i++) {// n
			for (int k = 1; k <= n; k++) {//n
			for (int j = 1; j <= n; j++) {// n
				System.out.println("hey");
				// O(n^3)
			}
			}
		}
		
		for( i=1; i<=n; i*=2) {
			System.out.println("hey");
			// O(log (N))
		}
		
		for(i=n/2; i<=n; i++) {
			for(int j=1; j<=n/2; j++) {
				for(int k=1; k<=n; k=k*2) {
					System.out.println("hey");
					
					// O(n^2*(log(N))
				}
			}
		}
		
		
		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
				// O(Nlong(N))
			}
		}
		
		
	}
}
