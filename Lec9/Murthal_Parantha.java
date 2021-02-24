package Lec9;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Parantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nop = sc.nextInt();
		int noc = sc.nextInt();
		int rank[] = new int[noc];
		for (int i = 0; i < rank.length; i++) {
			rank[i] = sc.nextInt();
		}
		Arrays.sort(rank);
		int lo=0;
		int hi= ((rank[rank.length-1])*(nop*(nop+1)))/2;
		int ans =0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(rank, nop, mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		System.out.println(ans);
		

	}

	private static boolean isitpossible(int[] rank, int nop, int mid) {
		// TODO Auto-generated method stub
		int total_Paratha=0;
		int time=0;
		int pn=1;
		int i=0;
		while(i<rank.length) {
			if(time+ pn*rank[i]<=mid) {
				time= time + pn*rank[i];
				pn++;
				total_Paratha++;
			}
			else {
				pn=1;
				i++;
				time=0;
			}
			if(total_Paratha>=nop) {
				return true;
			}
			
		}
		return false;
	}

}
