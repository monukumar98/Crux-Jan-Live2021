package Lec18;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ALL_Partitioning("nitin", "");
		PalindromPartitioning("nitin", "");

	}

	public static void ALL_Partitioning(String ques,String ans) {
      if(ques.length()==0) {
    	  System.out.println(ans);
    	  return ;
      }
		
		for (int i = 1; i <=ques.length(); i++) {
			String ros= ques.substring(i);
			String part =ques.substring(0,i);
			ALL_Partitioning(ros, ans+part+" ");
		}
		
	}
	public static void PalindromPartitioning(String ques,String ans) {
	      if(ques.length()==0) {
	    	  System.out.println(ans);
	    	  return ;
	      }
			
			for (int i = 1; i <=ques.length(); i++) {
				String ros= ques.substring(i);
				String part =ques.substring(0,i);
				if(is_Palindrome(part)) {
				PalindromPartitioning(ros, ans+part+" ");
				}
			}
			
		}
	public static boolean is_Palindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
