package Lec3;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		int row=1;
		int nst=n;
		
		while(row<=n) {
			
			// star
			int cst =1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			// next row 
			System.out.println();
			row++;
			
			
			
		}

	}

}
