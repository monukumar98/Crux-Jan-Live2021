package Lec19;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queencombination(new boolean [4], 0, 2, "",0 );

	}
	private static void Queencombination(boolean[] board, int qpsf, int tq, String ans, int idx) {
		// TODO Auto-generated method stub
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
      for (int i = idx; i < board.length; i++) {
		if(board[i]==false) {
			board[i]=true;
			Queencombination(board, qpsf+1, tq, ans+"b"+i+"q"+qpsf,i);
			board[i]=false;
		}
	}
	}
}
