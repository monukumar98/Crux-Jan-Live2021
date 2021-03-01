package Doubt_class_2_live;

public class tra {
	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		for(int row=1;row<=n;row++) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print('*' + " ");
				cst++;
			}
			System.out.println();
			nst++;
		}
	}
}
