package Lec20;
import java.util.*;
public class SubSet_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5,5,5,5,5};
		Arrays.sort(arr);
		subset(arr, 0, "", true);
        ArrayList<Integer> list = new  ArrayList<>();
          List<List<Integer>> ans = new  ArrayList<>();
          subset_leetcode(arr, 0, ans, list, true);
          System.out.println();
          System.out.println(ans);
	}

	public static void subset(int[] arr, int i, String ans, boolean inc) {
		// TODO Auto-generated method stub
		if (i == arr.length) {
			System.out.print(ans + "  ");
			return;
		}

		if (inc == false && arr[i] == arr[i - 1]) {
			subset(arr, i + 1, ans, false);
		} else {

			// yes
			subset(arr, i + 1, ans + arr[i] + " ", true);// i
			// no
			subset(arr, i + 1, ans, false);// e
		}

	}

	public static void subset_leetcode(int[] arr, int i, List<List<Integer>> ans,List<Integer> list, boolean inc) {
		// TODO Auto-generated method stub
		if (i == arr.length) {
			ans.add(new ArrayList<Integer>(list));
			return;
		}

		if (inc == false && arr[i] == arr[i - 1]) {
			subset_leetcode(arr, i + 1, ans, list, false);
		} else {

			// yes
			list.add(arr[i]);
			subset_leetcode(arr, i + 1, ans,list, true);// i
			list.remove(list.size()-1);
			// no
			subset_leetcode(arr, i + 1, ans,list, false);// e
		}

	}
}
