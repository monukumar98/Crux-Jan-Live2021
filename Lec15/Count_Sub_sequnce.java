package Lec15;

public class Count_Sub_sequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSub_Sequnce("abc", ""));

	}
	public static int countSub_Sequnce(String ques, String ans) {
		// TODO Auto-generated method stub
		// Base case
		if(ques.length()==0) {
//			System.out.print(ans+" ");
			return 1;
		}
		
		char ch = ques.charAt(0);
		int c1 = countSub_Sequnce(ques.substring(1), ans+ch);//yes
		int c2= countSub_Sequnce(ques.substring(1), ans);//No
		return c1+c2;
		
	}

}
