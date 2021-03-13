package Lec15;


public class Sub_Seq_of_String {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub_Sequnce("abc","");
		System.out.println();
		System.out.println(count);

	}

	public static void Sub_Sequnce(String ques, String ans) {
		// TODO Auto-generated method stub
		// Base case
		if(ques.length()==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		
		char ch = ques.charAt(0);
		Sub_Sequnce(ques.substring(1), ans+ch);//yes
		Sub_Sequnce(ques.substring(1), ans);//No
		
		
	}

}
