package Lec17;

public class Mapped_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapped("125","");

	}

	public static void Mapped(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String ros =ques.substring(1);
		Mapped(ros, ans+(char)(ch+'A'-'1'));
		// 2 length
		if(ques.length()>=2) {
			String str = ques.substring(0,2);//12
			int n = Integer.parseInt(str);
			if(n<=26) {
			ros =ques.substring(2);
			Mapped(ros, ans+(char)('A'+n-1));
			}
		}
		
		
	}

}
