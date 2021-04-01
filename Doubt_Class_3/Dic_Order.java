package Live_Jan_doubt;

import java.util.Arrays;
import java.util.Scanner;

public class Dic_Order {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String srt = scn.next();
		char[] ch = srt.toCharArray();
		Arrays.sort(ch);
//		System.out.println(String.valueOf(ch));
		String sort_str = String.valueOf(ch);
		Perm(sort_str, "", srt);
//		System.out.println("-------------------");
//		Perm(sort_str, "");

	}

	public static void Perm(String srt, String perm, String given) {
		if (srt.isEmpty()) {
//          Method 1
//			if(perm.compareTo(given)<=0) {
//			System.out.println(perm);
//			}
//			Method 2
			if (!perm.equals(given)) {
				System.out.println(perm);
			}
			return;
		}

		for (int i = 0; i < srt.length(); i++) {
			char ch = srt.charAt(i);
			String new_perm = perm + ch;
			String new_str = srt.substring(0, i) + srt.substring(i + 1);
			if (new_perm.compareTo(given.substring(0, new_perm.length())) >= 0) {
				Perm(new_str, new_perm, given);
			}
		}
	}

}
