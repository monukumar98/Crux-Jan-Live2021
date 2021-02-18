package Doubt_live;

public class Pat_1 {
	public static void main(String[] args) {
		int num = 5;
		
		int row = 1;
		int nst = num/2+1;
		int nsp = -1;
		while (row <= num) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}

			cst = 1;
			if(row==1||row==num) {
				cst++;
			}
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			if(row<=num/2) {
				nsp=nsp+2;
				nst--;
			}
			else {
				nsp=nsp-2;
				nst++;	
			}

			row++;
		}

	}
}
