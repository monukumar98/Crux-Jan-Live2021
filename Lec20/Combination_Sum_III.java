package Lec20;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[] = new boolean[9];
		int q=2;
		

	}

	private static void combination_List(boolean[] board, int qpsf, int tq, List<List<Integer>> ans, List<Integer> list,
			int idx, int sum, int n) {
		// TODO Auto-generated method stub
		if (tq == qpsf && sum==n) {
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				list.add(i + 1);
				combination_List(board, qpsf + 1, tq, ans, list, i,sum+(i+1),n);
				board[i] = false;
				list.remove(list.size() - 1);
			}
		}
	}

}
