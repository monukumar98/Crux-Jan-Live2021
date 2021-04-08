package Lec16;

public class Tricky_Permutations {
	sta
	public static void main(String[] args) {
		
		TrickyPermutations("abca", "");

	}
	public static void TrickyPermutations(String Ques,String ans) {
		// Base Case 
		if(Ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for (int i = 0; i < Ques.length(); i++) {
			String ros=Ques.substring(0,i)+Ques.substring(i+1);
			boolean flag=true;
			for(int j=i+1; j<Ques.length(); j++) {
				if(Ques.charAt(i)==Ques.charAt(j)) {
					flag=false;
					break;
				}
			}
			if(flag) {
				TrickyPermutations(ros, ans+Ques.charAt(i));
			}
			
		}
	}
}
