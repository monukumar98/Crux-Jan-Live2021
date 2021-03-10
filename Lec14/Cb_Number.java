package Lec14;

import java.util.Scanner;

public class Cb_Number {
static int [] cb = {2,3,5,7,11,13,17,19,23,29}; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int count=0;
		boolean visited [] = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
            for (int si = 0; si <=str.length()-len; si++) {
				int ei=si+len;
				String ans = str.substring(si,ei);
				if(is_CBnumber(Long.parseLong(ans))&& is_visited(visited,si,ei)) {
					count++;
					for (int i = si; i <ei; i++) {
						visited[i]=true;
					}
				}
			}
		}
		System.out.println(count);
	}
	public static boolean is_visited(boolean [] visit,int si,int ei) {
		
		for (int i = si; i <ei; i++) {
			if(visit[i]) {
				return false;
			}
			
		}
		return true;
	}
	public static boolean is_CBnumber(long n) {
		if(n==0||n==1) {
			return false;
		}
		for (int i = 0; i < cb.length; i++) {
			if(cb[i]==n) {
				return true;
			}
		}
		for (int i = 0; i < cb.length; i++) {
			if(n%cb[i]==0) {
				return false;
			}
		}
		return true;
		
	}

}
