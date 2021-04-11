package Lec27;

import java.util.Stack;

public class Next_greater_Elment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 3, 2, 17, 2, 9, 3 };
		next_greater(arr);

	}

	public static void next_greater(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				ans[s.pop()] = arr[i];
			}

			s.push(i);
		}
		while (!s.isEmpty()) {
			ans[s.pop()] = -1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + "," + ans[i]);
		}
	}

}
