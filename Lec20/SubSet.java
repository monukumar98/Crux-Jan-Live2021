package Lec20;
import java.util.*;
public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2 };
		//subset(arr, 0, "");
		ArrayList<Integer> list = new  ArrayList<>();
        List<List<Integer>> ans = new  ArrayList<>();
        subset_Leetcode(arr, 0, ans, list);
        System.out.println();
        System.out.println(ans);

	}

	public static void subset(int[] arr, int i, String ans) {
		// TODO Auto-generated method stub
		if (i == arr.length) {
			System.out.print(ans + "  ");
			return;
		}

		// no
		subset(arr, i + 1, ans);
		// yes
		subset(arr, i + 1, ans + arr[i] + " ");

	}
	public static void subset_Leetcode(int[] arr, int i, List<List<Integer>> ans,List<Integer> list) {
		// TODO Auto-generated method stub
		if (i == arr.length) {
			ans.add(new ArrayList<Integer>(list));
			return;
		}

		// no
		subset_Leetcode(arr, i + 1, ans,list);
		// yes
		list.add(arr[i]);
		subset_Leetcode(arr, i + 1, ans,list);
		list.remove(list.size()-1);

	}

}
