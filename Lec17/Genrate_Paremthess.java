package Lec17;



public class Genrate_Paremthess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parenthess(3, 0, 0, "");

	}

	private static void parenthess(int n, int opening, int closing, String ans) {
		// TODO Auto-generated method stub
		
		if(opening==n&& closing==n) {
			System.out.println(ans);
			return;
		}
		
		if(closing<opening) {
			parenthess(n, opening, closing+1, ans+")");
		}
		if(opening<n) {
			parenthess(n, opening+1, closing, ans+"(");
		}
		

	}
	

}
