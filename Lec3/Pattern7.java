package Lec3;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nsp1=0;
		int nsp2=n-2;
		while(row<=n) {
			
			//space
			int csp1=1;
			while(csp1<=nsp1) {
				System.out.print("  ");
				csp1++;
			}
			
			// star
			System.out.print("* ");
			
			// space
			int csp2=1;
			while(csp2<=nsp2) {
				System.out.print("  ");
				csp2++;
			}
			
			// star
			if(row!=n/2 +1)
			System.out.print("* ");
			// next row
			// mirror
			if(row<=n/2) {
			nsp1++;
			nsp2-=2;
			}
			else{
				nsp1--;
				nsp2+=2;
			}
			row++;
			System.out.println();
			
		}

	}

}
