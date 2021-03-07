package Lec13;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(fact_Head_Recursion(5));
   System.out.println("............");
   System.out.println(fact_Tail_Recursion(5,1));
	}

	public static int fact_Head_Recursion(int n) {
		// Base Case
		if (n == 0){
			return 1;
		}
		
		return n*fact_Head_Recursion(n-1);
		
		
	}
	
	public static int fact_Tail_Recursion(int n,int ans) {
		// Base Case
		if (n == 0){
			return ans;
		}
		
		 return fact_Tail_Recursion(n-1,ans*n);
		 
	
		
	}
}
