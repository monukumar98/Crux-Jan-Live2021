package Lec21;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] borad = new boolean[n][n];
		nqueen(borad, 0, n);
		System.out.println();
		System.out.println(".....................");
		nqueen_Fisrt_answer(borad, 0, n);

	}

	private static void nqueen(boolean[][] board, int row, int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			display(board);
			return;
		}
		if (row >= board.length) {
			return;
		}

		for (int col = 0; col < board.length; col++) {
			if (Is_Safe(row, col, board)) {
				board[row][col] = true;
				nqueen(board, row + 1, n - 1);
				board[row][col] = false;
			}

		}

	}
	private static boolean nqueen_Fisrt_answer(boolean[][] board, int row, int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			display(board);
			return true;
		}
		if (row >= board.length) {
			return false;
		}
		boolean bs=false;
		for (int col = 0; col < board.length; col++) {
			if (Is_Safe(row, col, board)) {
				board[row][col] = true;
				bs = nqueen_Fisrt_answer(board, row + 1, n - 1);
				if(bs) {
					return bs;
				}
				board[row][col] = false;
			}

		}
		
return bs;
	}

	private static boolean Is_Safe(int row, int col, boolean[][] borad) {
		// TODO Auto-generated method stub
		// vertical
		int r = row - 1;

		while (r >= 0) {
			if (borad[r][col]) {
				return false;
			}
			r--;
		}
		// Right Diagonal
		r = row - 1;
		int c = col + 1;
		while (r >= 0 && c < borad.length) {
			if (borad[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		// Left Diagonal
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (borad[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		return true;
	}

	public static void display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
