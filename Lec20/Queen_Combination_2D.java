package Lec20;

public class Queen_Combination_2D {
  static int count=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[3][4];
		Queencombination(board, 0, 0, 0, 3, "");

	}

	private static void Queencombination(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		// TODO Auto-generated method stub
		if (qpsf == tq) {
			System.out.println(count +"."+ans);
			count++;
			return;
		}
		if (col >= board[0].length) {
			row++;
			col = 0;
		}
		if (row == board.length) {
			return;
		}
		// yes
		board[row][col] = true;
		Queencombination(board, row, col+1, qpsf + 1, tq, ans + "{" + row + "-" + col + "} ");
		board[row][col] = false;// Backtracking
		// no
		Queencombination(board, row, col+1, qpsf, tq, ans);

	}

}
