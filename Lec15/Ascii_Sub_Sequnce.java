package Lec15;

public class Ascii_Sub_Sequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ascii_sub_seq("abc", "");

	}

	public static void ascii_sub_seq(String ques, String ans) {
		// TODO Auto-generated method stub
		// Base case 
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		ascii_sub_seq(ques.substring(1), ans);// No
		ascii_sub_seq(ques.substring(1), ans+ch);// Yes
		ascii_sub_seq(ques.substring(1), ans+(int)ch);// Yes with Ascii

	}

}
