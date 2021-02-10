package Lec3;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row=1;
		int nst=n;
		while (row <= n) {

			// star
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			// next row
			nst--;
			System.out.println();
			row++;

		}

	}

}
