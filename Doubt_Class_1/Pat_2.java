package Doubt_live;

import java.util.Scanner;

public class Pat_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int nsp1 = num-1;
		int nsp2 = -1;
		int nst  = 1;  
		for(int row=1;row<=num;row++) {
			int csp1 = 1;
			while(csp1<=nsp1) {
				System.out.print("  ");
				csp1++;
			}		
			int cst = 1;
			while(cst<=nst) {
				
				System.out.print((nst-cst+1)+" ");
				cst++;
			}
			
			int csp2 = 1;
			while(csp2<=nsp2) {
				System.out.print("  ");
				csp2++;
			}
			cst = 1;
			if(row==1||row==num) {
				cst++;
			}
			while(cst<=nst) {
				System.out.print(cst+" ");
				cst++;
			}
			
			System.out.println();
			if(row<=num/2) {
				nsp1=nsp1-2;
				nst++;
				nsp2 = nsp2+2;
			}
			else {
				nsp1=nsp1+2;
				nst--;
				nsp2 = nsp2-2;
			}
			
		}
	}
}
