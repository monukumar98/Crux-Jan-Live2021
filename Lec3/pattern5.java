package Lec3;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row=1;
		int nst=1;
		int nsp=n-1;
		while(row<=n) {
			// space
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			// star
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			// next row
			nsp--;
			nst++;
			row++;
			System.out.println();
		}

	}

}
