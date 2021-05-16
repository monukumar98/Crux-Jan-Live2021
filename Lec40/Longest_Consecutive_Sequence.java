package Lec40;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 8, 3, 9, 2, 4, 11, 10, 1 };
		System.out.println(LongestConsecutiveSequence(arr));

	}

	public static int LongestConsecutiveSequence(int arr[]) {
		int ans = 0;
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if (map.containsKey(key - 1)) {
				map.put(key, false);
			} else {
				map.put(key, true);
			}
			if (map.containsKey(key + 1)) {
				map.put(key + 1, false);
			}

		}
	//	System.out.println(map);
		for (int key : map.keySet()) {
			if (map.get(key)) {
				int count = 0;
			
				while (map.containsKey(key + count)) {
					count++;
				}
				ans=Math.max(count, ans);
				
			}
			
		}

		return ans;

	}
}
