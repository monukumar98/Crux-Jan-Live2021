package Lec23;

public class Soe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime_seive(100);// Nlog(log(N))

	}
	 public static void prime_seive(int n) {
		 boolean prime [] = new boolean[n+1];
		 // false-->prime
		 prime[0]=true;
		 prime[1]=true;
		 // 2 to N prime
		 for(int i=2; i*i<=n; i++) {
			 if(!prime[i]) {
				 for(int mul=2; mul*i<=n; mul++) {
					prime[mul*i]=true; 
				 }
			 }
		 }
		 for (int i = 2; i < prime.length; i++) {
			if(!prime[i]) {
				System.out.print(i+" ");
			}
		}
	 }

}
