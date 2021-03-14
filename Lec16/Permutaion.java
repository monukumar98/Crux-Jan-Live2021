package Lec16;

public class Permutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_Permuation("aba", "");
		System.out.println();
		print_Permuation_Method("abc", "");
	}

	public static void print_Permuation(String Ques, String ans) {
		// TODO Auto-generated method stub
		if (Ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = Ques.charAt(0);
		for (int i = 0; i <= ans.length(); i++) {
			print_Permuation(Ques.substring(1), ans.substring(0, i) + ch + ans.substring(i));

		}

	}

	public static void print_Permuation_Method(String Ques, String ans) {
		// TODO Auto-generated method stub
		if (Ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		// char ch = Ques.charAt(0);
		for (int i = 0; i < Ques.length(); i++) {
			String ros = Ques.substring(0, i) + Ques.substring(i + 1);

			print_Permuation_Method(ros, ans + Ques.charAt(i));

		}

	}

}
