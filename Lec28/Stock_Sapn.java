package Lec28;

import java.util.Arrays;
import java.util.Stack;

public class Stock_Sapn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 80, 50, 70, 30, 20, 40, 90, 10, 5, 35 };
		span(arr);

	}

	public static void span(int[] arr) {
		int ans[] = new int[arr.length];
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				s.pop();
			}
			if (s.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - s.peek();
			}
			s.push(i);

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ans));
	}

}
