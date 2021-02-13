package Lec4;
import java.util.*;
public class Pascal_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=0;
		int nst =1;
		while(row<n) {
			// star
			int cst =0;
			int val =1;
			while(cst<nst) {
				System.out.print(val+" ");
				val = (val*(row-cst))/(cst+1);
				cst++;
			}
			nst++;
			row++;
			System.out.println();
		}

	}

}
