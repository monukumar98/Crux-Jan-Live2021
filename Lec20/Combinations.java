package Lec20;
import java.util.*;
public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[]= new boolean[4];
	     int q=2;
	   //combination(board, 0, q, "", 0);
	   ArrayList<Integer> list = new  ArrayList<>();
       List<List<Integer>> ans = new  ArrayList<>();

       combination_List(board, 0, q, ans, list, 0);
       System.out.println(ans);

	}
	private static void combination(boolean[] board, int qpsf, int tq, String ans, int idx) {
		// TODO Auto-generated method stub
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
      for (int i = idx; i < board.length; i++) {
		if(board[i]==false) {
			board[i]=true;
			combination(board, qpsf+1, tq, ans+(i+1),i);
			board[i]=false;
		}
      }
	}
      private static void combination_List(boolean[] board, int qpsf, int tq, List<List<Integer>>ans,List<Integer> list, int idx) {
  		// TODO Auto-generated method stub
  		if(tq==qpsf) {
  			ans.add(new ArrayList<>(list));
  			return;
  		}
        for (int i = idx; i < board.length; i++) {
  		if(board[i]==false) {
  			board[i]=true;
  			list.add(i+1);
  			combination_List(board, qpsf+1, tq,ans,list,i);
  			board[i]=false;
  			list.remove(list.size()-1);
  		}
  	}
	}

}
