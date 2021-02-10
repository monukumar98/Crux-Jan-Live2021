package Lec3;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int row=1;
		int nsp = 0;
		int nst = n;
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
			nsp+=2;// nsp = nsp + 2;
			nst--;
			row++;
			System.out.println();
		}


	}

}
