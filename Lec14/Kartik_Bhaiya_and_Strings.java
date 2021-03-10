package Lec14;

import java.util.Scanner;

public class Kartik_Bhaiya_and_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.next();
		int flip_a=Len_of_substring(str, k, 'a');
		int flip_b=Len_of_substring(str, k, 'b');
		System.out.println(Math.max(flip_a, flip_b));

	}
	public static int Len_of_substring(String str , int k, char ch) {
		int i=0;
		int j=0;
		int ans=0;
		int count=0;
		while(j<str.length()) {
			if(str.charAt(j)==ch) {
				count++;
			}
			while(count>k) {
				if(str.charAt(i)==ch) {
					count--;
				}
				i++;
			}
			ans = Math.max(ans, j-i+1);
			j++;
		}
		return ans;
	}

}
