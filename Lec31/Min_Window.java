package Lec31;

public class Min_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minwindow(str, t));
	}

	public static String minwindow(String s, String t) {
		int freq_t[] = new int[256];
		int freq_s[] = new int[256];

		for (char c : t.toCharArray()) {
			freq_t[c]++;
		}
		int count = 0;
		int min_len = Integer.MAX_VALUE;
		int start_index = -1;
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq_s[ch]++;

			if (freq_s[ch] <= freq_t[ch]) {
				count++;
			}

			if (count == t.length()) {

				while ((freq_s[s.charAt(start)] > freq_t[s.charAt(start)] || freq_t[s.charAt(start)] == 0)) {

					freq_s[s.charAt(start)]--;

					start++;
				}
				if (min_len > i - start + 1) {
					min_len = i - start + 1;
					start_index = start;
				}

			}
		}
		if (start_index == -1) {
			return "";
		}
		return s.substring(start_index, start_index + min_len);
	}

}
