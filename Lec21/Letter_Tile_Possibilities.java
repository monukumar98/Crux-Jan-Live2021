package Lec21;

public class Letter_Tile_Possibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAB";
		int[] freq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch - 'A']++;

		}
		LetterTilePossibilities(freq, "");
		System.out.println(LetterTilePossibilities_count(freq, ""));
	}
	public static void LetterTilePossibilities(int []freq,String ans) {
		
		System.out.println(ans);
		
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]!=0) {
				freq[i]--;
				char ch = (char)(i+'A');
				LetterTilePossibilities(freq, ans+ch);
				freq[i]++;
			}
		}
	}
public static int  LetterTilePossibilities_count(int []freq,String ans) {
		
		//System.out.println(ans);
		int res=0;
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]!=0) {
				freq[i]--;
				char ch = (char)(i+'A');
				res+=LetterTilePossibilities_count(freq, ans+ch)+1;
				freq[i]++;
			}
		}
		return res;
	}
}
