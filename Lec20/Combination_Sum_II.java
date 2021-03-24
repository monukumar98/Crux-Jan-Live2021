package Lec20;

import java.util.*;

public class Combination_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Coin = {10,1,2,7,6,1,5};
		Arrays.sort(Coin);
		int ammount = 8;
		 Arrays.sort(Coin);
	      ArrayList<Integer> list = new  ArrayList<>();
	          List<List<Integer>> ans = new  ArrayList<>();
		//Coin_Changes(Coin, ammount, "",0);
		Coin_Changes_Leetcode(Coin, ammount, ans, list,0);
		System.out.println(ans);
	}

	private static void Coin_Changes(int[] coin, int ammount, String ans,int i) {
		// TODO Auto-generated method stub
		if (ammount == 0) {
			System.out.println(ans);
			return;
		}

		for (int j = i; j < coin.length; j++) {
			if(j>i && coin[j]==coin[j-1]) {
				continue;
			}
			if (ammount - coin[j] >= 0) {
				Coin_Changes(coin, ammount - coin[j], ans + coin[j],j+1);
			}
		}
		
	}
	private static void Coin_Changes_Leetcode(int[] coin, int ammount,List<List<Integer>> ans , ArrayList<Integer> list,int i) {
		// TODO Auto-generated method stub
		if (ammount == 0) {
		ans.add(new ArrayList<>(list));
			return;
		}

		for (int j = i; j < coin.length; j++) {
			if(j>i && coin[j]==coin[j-1]) {
				continue;
			}
			if (ammount - coin[j] >= 0) {
				list.add(coin[j]);
				Coin_Changes_Leetcode(coin, ammount - coin[j], ans, list,j+1);
				list.remove(list.size()-1);
			}
		}
		
	}

}
