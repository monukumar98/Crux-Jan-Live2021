package Lec3;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		int row=1;
		int nst=n/2;
		int nsp=1;
		while(row<=n) {
			// star
			int cst =1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			// space
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			
			
			// star
			cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			// n = 7
			// next row 
			if(row<=n/2) {
			nst--;
			nsp+=2;
			}
			// row == 4 nst =0
			else {
				nst++;
				nsp-=2;
			}
			row++;
			System.out.println();
			
		}

	}

}
