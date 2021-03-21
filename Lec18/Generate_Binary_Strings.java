package Lec18;

public class Generate_Binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generate_BinaryStrings("1??0?101", "");
		System.out.println();

	}

	public static void Generate_BinaryStrings(String Ques, String ans) {
		if (Ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = Ques.charAt(0);
		if (ch == '?') {
			Generate_BinaryStrings(Ques.substring(1), ans + "0");
			Generate_BinaryStrings(Ques.substring(1), ans + "1");

		} else {
			Generate_BinaryStrings(Ques.substring(1), ans + ch);
		}
	}

}
