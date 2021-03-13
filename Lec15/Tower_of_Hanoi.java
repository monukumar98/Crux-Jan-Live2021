package Lec15;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TOH(3,"T1","T2","T3");
	}

	public static void TOH(int n, String T1, String T2, String T3) {
		// TODO Auto-generated method stub
		if(n==0) {
			return ;
		}
		
		TOH(n-1, T1,  T3,T2);
		System.out.println("Move "+n+"th disk from "+T1+" to "+T3);
		TOH(n-1, T2, T1, T3);
	}

}
