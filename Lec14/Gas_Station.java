package Lec14;

public class Gas_Station {
// https://leetcode.com/problems/gas-station/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gas[] = { 1, 2, 3, 4, 5 };
		int cost[] = { 3, 4, 5, 1, 2 };
		System.out.println(ispossible(gas, cost));

	}
	public static int ispossible(int []gas,int []cost) {
		int net_res=0;
		int idx=0;
		int curr=0;
		for (int i = 0; i < cost.length; i++) {
			net_res+=(gas[i]-cost[i]);
			curr+=(gas[i]-cost[i]);
			if(curr<0) {
				idx=i+1;
				curr=0;
			}
		}
		if(net_res<0) {
			return -1;
		}
		else
			return idx;
	}

}
