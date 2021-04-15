package Lec28;

import java.util.*;

public class First_Negative_in_K_size_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, -1, -8, 6, -30, 40, -50, 60, -70, 80 };
		First_Negative(arr, 3);

	}

	private static void First_Negative(int[] arr, int k) {
		// TODO Auto-generated method stub
		Queue<Integer> qq = new LinkedList<>();
		
		for (int i = 0; i < k && i < arr.length; i++) {
			if (arr[i] < 0) {
				qq.add(i);
			}
		}
		if (qq.isEmpty()) {
			System.out.println("0 "+ "-- >"+(k-1)+" "+0);
		} else
			System.out.println("0 "+ "-- >"+(k-1)+" "+arr[qq.peek()]);
		for (int i = k; i < arr.length; i++) {
			if (!qq.isEmpty() && qq.peek() == i - k) {
				qq.remove();
			}
			if (arr[i] < 0) {
				qq.add(i);
			}

			if (qq.isEmpty()) {
				System.out.println(i-k+1+ "-- >"+(i)+" "+0);
			} else {
				System.out.println(i-k+1+ "-- >"+(i)+" "+arr[qq.peek()]);
			}

		}

	}

}
