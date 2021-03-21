package Lec19;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		Queenpermutation(board, 0, 2, "");
	}

	private static void Queenpermutation(boolean[] board, int qpsf, int tq, String ans) {
		// TODO Auto-generated method stub
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
      for (int i = 0; i < board.length; i++) {
		if(board[i]==false) {
			board[i]=true;
			Queenpermutation(board, qpsf+1, tq, ans+"b"+i+"q"+qpsf);
			board[i]=false;
		}
	}
	}

}
