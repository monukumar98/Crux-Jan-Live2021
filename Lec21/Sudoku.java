package Lec21;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
          
		     Sudoku_Solver(arr, 0, 0);
	
	}

	public static void Sudoku_Solver(int[][] arr, int row, int col) {

		if (col >= 9) {
			row++;
			col = 0;
		}
		if (row >= 9) {
              display(arr);
			return;
		}
		if (arr[row][col] == 0) {
			for (int val = 1; val <= 9; val++) {
				if (Is_safe(arr, row, col, val)) {
					arr[row][col] = val;
					Sudoku_Solver(arr, row, col + 1);
					arr[row][col] = 0;
				}
			}
		}
		else {
			Sudoku_Solver(arr, row, col+1);
		}

	}

	private static boolean Is_safe(int[][] arr, int row, int col, int val) {
		
		// row
		for(int c=0; c<9; c++) {
			if(arr[row][c]==val) {
				return false;
			}
		}
		// col
		for(int r=0; r<9; r++) {
			if(arr[r][col]==val) {
				return false;
			}
		}
		// 3*3 Matrix
		
//		int r = row/3;
//		int c=col/3;
//		r=r*3;
//		c=c*3;
//		for(int i=r; i<r+3; i++) {
//			for(int j=c; j<c+3; j++) {
//				if(arr[i][j]==val) {
//					return false;
//				}
//			}
//		}
		
		
		// second Method for 3*3
		int r = row-row%3;
		int c = col-col%3;
		for(int i=r; i<r+3; i++) {
			for(int j=c; j<c+3; j++) {
				if(arr[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
