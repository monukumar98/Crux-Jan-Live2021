package Lec34;

public class SubSequnceusingbitMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		SubSequnce(str);

	}

	private static void SubSequnce(String str) {
		// TODO Auto-generated method stub
		int n = 1 << str.length();
		for (int i = 0; i < n; i++) {
			pattern(str, i);
		}

	}

	private static void pattern(String str, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i != 0) {
			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			i >>= 1;
			pos++;
		}
		System.out.println();

	}

}
