package Lec16;

public class Staris_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stairs(4,""));

	}

	public static int stairs(int n,String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans.substring(0,ans.length()-1));
			return 1;
		}
		
		int sum=0;
		for(int steps=1; steps<=3 && n-steps>=0; steps++) {
			sum+=stairs(n-steps, ans+steps+"-");
		}
		return sum;

	}

}
