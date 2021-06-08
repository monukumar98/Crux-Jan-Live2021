package Lec16;

public class Lexo_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lexo_Count(0,1000);
	//Tricky_Permutations.TrickyPermutations("abc","");

	}

	public  static void lexo_Count(int curr, int end) {
		// TODO Auto-generated method stub
		if(curr>end) {
			return;
		}
		System.out.println(curr);
		// if  curr =0 Recursive 1 to 9
		// else Recursive 0 to 9
		int i=0;
		if(curr==0) {
			i=1;
		}
		
		for (; i <=9; i++) {
			lexo_Count(curr*10+i, end);
		}
		
	}

}
