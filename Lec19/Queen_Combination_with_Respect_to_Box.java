package Lec19;

public class Queen_Combination_with_Respect_to_Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queencombination(new boolean[4], 0, 2, "", 0);

	}

	private static void Queencombination(boolean[] board, int qpsf, int tq, String ans, int idx) {
		// TODO Auto-generated method stub
       if(qpsf==tq) {
    	   System.out.println(ans);
    	   return;
       }
       if(idx>=board.length) {
    	   return;
       }
       // yes
       board[idx]=true;
       Queencombination(board, qpsf+1, tq, ans+"b"+idx, idx+1);
       board[idx]=false;// Backtracking
       // no
       Queencombination(board, qpsf, tq, ans, idx+1);
       
       
	}
}
