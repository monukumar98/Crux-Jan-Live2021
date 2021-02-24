package Lec9;

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int nos = sc.nextInt();
			int noc = sc.nextInt();
			int[] Stalls = new int[nos];
			for (int i = 0; i < Stalls.length; i++) {
				Stalls[i] = sc.nextInt();
			}
			Arrays.sort(Stalls);
			System.out.println(AGGRCOW_Answer(Stalls, noc));
			t--;
		}

	}

	public static int AGGRCOW_Answer(int[] stalls, int noc) {
		int lo = 0;
		int hi = stalls[stalls.length - 1] - stalls[0];
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(stalls, noc, mid)) {
				ans = mid;
				lo = mid + 1;

			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

	private static boolean isitpossible(int[] stalls, int noc, int mid) {
		// TODO Auto-generated method stub
	    int cow=1;
	    int place=stalls[0];
	    int i=1;
	    while(i<stalls.length) {
	    	if(stalls[i]-place>=mid) {
	    		cow++;
	    		place=stalls[i];
	    	}
	    	i++;
	    	if(cow>=noc) {
	    		return true;
	    	}
	    }
	    return false;
	    
	}

}
