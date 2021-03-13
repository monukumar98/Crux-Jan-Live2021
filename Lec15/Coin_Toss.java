package Lec15;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cointoss(4, "");
		System.out.println();
		System.out.println("................");
		cointoss_no_2_Cos_head(4, "");
		System.out.println();
		System.out.println("................");
		cointoss_no_2_Cos_headMethod(4, "", false);

	}

	private static void cointoss(int n, String ans) {
		// TODO Auto-generated method stub
		// Case case
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		// head
		cointoss(n - 1, ans + "H");
		// tail
		cointoss(n - 1, ans + "T");

	}

	private static void cointoss_no_2_Cos_head(int n, String ans) {
		// TODO Auto-generated method stub
		// Case case
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		// head
		if (ans.length()==0 ||ans.charAt(ans.length() - 1) != 'H') {
			cointoss_no_2_Cos_head(n - 1, ans + "H");
		}
		// tail
		cointoss_no_2_Cos_head(n - 1, ans + "T");

	}
	private static void cointoss_no_2_Cos_headMethod(int n, String ans,boolean isHead) {
		// TODO Auto-generated method stub
		// Case case
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		// head
		if (!isHead) {
			cointoss_no_2_Cos_headMethod(n - 1, ans + "H",true);
		}
		// tail
		cointoss_no_2_Cos_headMethod(n - 1, ans + "T",false);

	}

}
