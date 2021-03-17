package Lec17;

import java.util.ArrayList;

public class SubSqunce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		//Get_SubSeq("abc", list, "");
		//System.out.println(list);
		System.out.println(Get_SubSeq("abc"));
		System.out.println(Get_SubSeq2("abc"));

	}

	public static void Get_SubSeq(String ques, ArrayList<String> list, String ans) {
		if (ques.length() == 0) {
			list.add(ans);
			return;
		}
		Get_SubSeq(ques.substring(1), list, ans + ques.charAt(0));
		Get_SubSeq(ques.substring(1), list, ans);

	}

	public static ArrayList<String> Get_SubSeq(String ques) {
		if (ques.length() == 0) {
			ArrayList<String> bs  = new ArrayList<String>();
			bs.add("");
			return bs;
			

		}
		char ch = ques.charAt(0);
		ArrayList<String> rs =Get_SubSeq(ques.substring(1));//bc
		ArrayList<String> ml=new ArrayList<String>();
		for(String st :rs) {
			ml.add(ch+st);
			ml.add(st);
		
			
		}
		return ml;
		

	}
	public static ArrayList<String> Get_SubSeq2(String ques) {
		if (ques.length() == 0) {
			ArrayList<String> bs  = new ArrayList<String>();
			bs.add("");
			return bs;
			

		}
		char ch = ques.charAt(0);
		ArrayList<String> rs =Get_SubSeq2(ques.substring(1));//bc
		//ArrayList<String> ml=new ArrayList<String>();
	     int size = rs.size();
	     for(int i=0; i<size; i++) {
	    	 String st = rs.get(i);
	    	 rs.add(ch+st);
	     }
	     return rs;
		

	}
}
