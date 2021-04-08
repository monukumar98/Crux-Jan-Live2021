package Lec17;

import java.util.ArrayList;

import Lec16.Tricky_Permutations;



public class Coin_Toss_UsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(Coin_Toss(3));
	System.out.println(Coin_Toss_no_2_con_head(3));
	Tricky_Permutations.TrickyPermutations("abc", "");
	

	}

	private static ArrayList<String> Coin_Toss(int n) {
		// TODO Auto-generated method stub

		if (n == 0) {
			ArrayList<String> bs = new ArrayList<>();
			bs.add("");
			return bs;
		}
		ArrayList<String> rs = Coin_Toss(n-1);
		ArrayList<String> ml=new ArrayList<String>();
		for(String val:rs) {
			ml.add(val+"T");
			ml.add(val+"H");
			
		}
		return ml;
	}
	private static ArrayList<String> Coin_Toss_no_2_con_head(int n) {
		// TODO Auto-generated method stub

		if (n == 0) {
			ArrayList<String> bs = new ArrayList<>();
			bs.add("");
			return bs;
		}
		ArrayList<String> rs = Coin_Toss_no_2_con_head(n-1);
		ArrayList<String> ml=new ArrayList<String>();
		for(String val:rs) {
			ml.add(val+"T");
			if(val.length()==0 || val.charAt(val.length()-1)!='H'){
			ml.add(val+"H");
			}
			
		}
		return ml;
	}
}
