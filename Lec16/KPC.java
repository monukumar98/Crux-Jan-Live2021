package Lec16;

public class KPC {
static String [] getString= {"abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		key_Paid("12","");

	}
	public static void key_Paid(String Ques, String ans) {
		// TODO Auto-generated method stub
		// Base Case
		if(Ques.length()==0) {
			System.out.print(ans+" ");
			return; 
		}
		
		
		char ch = Ques.charAt(0);
		String get=getString[ch-49];// 49-49
		for (int i = 0; i < get.length(); i++) {
			key_Paid(Ques.substring(1), ans+get.charAt(i));
		}
		
		
	}

}
