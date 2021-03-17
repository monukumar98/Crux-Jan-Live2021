package Lec17;

import java.util.ArrayList;

public class Permuation_Using_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Get_Permutation("abc"));
		

	}
	public static ArrayList<String> Get_Permutation(String ques){
		if(ques.length()==0) {
			ArrayList<String> bs = new ArrayList<>();
			bs.add("");
			return bs;
		}
		
		
		char ch = ques.charAt(0);
		ArrayList<String>  rs = Get_Permutation(ques.substring(1));//bc
		ArrayList<String> ml = new ArrayList<String>();
		for(String val : rs) {
			for(int i=0; i<=val.length(); i++) {
				String first=val.substring(0,i);
				String Second=val.substring(i);
				ml.add(first+ch+Second);
				
			}
		}
		return ml;
		
		
	}

}
