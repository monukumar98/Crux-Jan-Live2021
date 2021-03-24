package Lec20;
import java.util.*;
public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Coin = { 2, 3, 5 };
		int ammount =10;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Coin_Changes(Coin, ammount,list ,ans, 0);
		System.out.println(ans);
		
	}
	public static void Coin_Changes(int coin[],int ammount,List<Integer> list,List<List<Integer>> ans ,int i ) {
		
		if(ammount==0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		
		for (int j = i; j < coin.length; j++) {
			if(ammount-coin[j]>=0) {
				list.add(coin[j]);
			Coin_Changes(coin, ammount-coin[j], list,ans, j);
			list.remove(list.size()-1);
			
			}
		}
		System.out.println("list "+list);
	}

}
