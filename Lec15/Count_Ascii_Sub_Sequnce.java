package Lec15;

public class Count_Ascii_Sub_Sequnce {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countascii_sub_seq("abc", ""));

	}

	public static int countascii_sub_seq(String ques, String ans) {
		// TODO Auto-generated method stub
		// Base case
		if (ques.length() == 0) {
			// System.out.print(ans+" ");
			return 1;
		}
		char ch = ques.charAt(0);
		int c1 = countascii_sub_seq(ques.substring(1), ans);// No
		int c2 = countascii_sub_seq(ques.substring(1), ans + ch);// Yes
		int c3 = countascii_sub_seq(ques.substring(1), ans + (int) ch);// Yes with Ascii
		return c1 + c2 + c3;
	}

}
