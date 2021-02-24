package Lec9;

import java.util.Arrays;
import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int nob = sc.nextInt();
			int nos = sc.nextInt();
			int[] page = new int[nob];
			for (int i = 0; i < page.length; i++) {
				page[i] = sc.nextInt();
			}
			
			System.out.println(AGGRCOW_Answer(page, nos));
			t--;
		}

	}

	public  static int  AGGRCOW_Answer(int[] page, int nos) {
		int lo=0;
		int hi=0;
		int ans=0;
		for(int val :page) {
			hi+=val;
		}
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(page,nos,mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] book, int nos, int mid) {
		// TODO Auto-generated method stub
		int Student=1;
		int pageread=0;
		int i=0;
		while(i<book.length) {
			if(pageread+book[i]<=mid) {
				pageread+=book[i];
				i++;
			}
			else {
				Student++;
				pageread=0;
				
			}
			if(Student>nos) {
				return false;
			}
		}
		
		
		
		
		return true;
	}

}
