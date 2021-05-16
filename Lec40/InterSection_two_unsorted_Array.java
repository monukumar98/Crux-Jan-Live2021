package Lec40;

import java.util.HashMap;

public class InterSection_two_unsorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 21, 13, 4, 5, 67, 78, 6 };
		int[] arr2 = { 21, 14, 7, 5, 1, 78 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
//			if(map.containsKey(arr1[i])) {
////				int of = map.get(map.get(arr1[i]));
//				map.put(arr1[i],map.get(map.get(arr1[i]))+1);
//			}
//			else {
//				map.put(arr1[i], 1);
//			}
			
		}
		for (int i = 0; i < arr2.length; i++) {
			int key = arr2[i];
			if(map.containsKey(key) && map.get(key)!=0) {
				System.out.print(arr2[i]+" ");
				map.put(arr2[i], map.get(key)-1);
			}
		}

	}

}
