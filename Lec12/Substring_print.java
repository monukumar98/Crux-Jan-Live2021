package Lec12;

import java.util.Scanner;

public class Substring_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//print_Substring(str);
		print_Substring_pali(str);
		System.out.println(is_pali("nitin"));
		

	}
	public static void print_Substring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <=str.length(); j++) {
				System.out.println(str.substring(i,j));
				
			}
		}
	}
	public static void print_Substring_pali(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <=str.length(); j++) {
				String ans =str.substring(i,j);
				if(is_pali(ans)) {
					System.out.println(ans);
				}
				
			}
		}
	}
	public static boolean is_pali(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
				
	}

}
