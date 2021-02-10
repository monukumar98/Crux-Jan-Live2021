package Lec3;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row=1;
		int nst =n;
		int nsp=0;
		while(row<=n) {
			// space
			int csp=1;
			// 1<=0
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
			nsp++;
			nst--;
			row++;
			System.out.println();
		}

	}

}
