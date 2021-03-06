package Lec12;

import java.util.Scanner;

public class Playing_with_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Count_Good_Substring(str));

	}

	public static int Count_Good_Substring(String str) {

		int ans = 0;// -2^31
		for (int i = 0; i < str.length();) {
			int count = 0;
			// if (is_vowels(str.charAt(i))) {
			while (i < str.length() && is_vowels(str.charAt(i))) {

				count++;
				i++;

			}
			i++;
			ans = Math.max(ans, count);

		}

		return ans;

	}

	public static boolean is_vowels(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
