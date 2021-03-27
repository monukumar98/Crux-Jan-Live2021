package Lec21;

/*
 * Given an integer N, print all the N digit numbers in increasing order, such that
 *  their digits are in strictly increasing order(from left to right).

Example 1:

Input:
N = 1
Output:
0 1 2 3 4 5 6 7 8 9
Explanation:
Single digit numbers are considered to be 
strictly increasing order.
Example 2:

Input:
N = 2
Output:
12 13 14 15 16 17 18 19 23....79 89
Explanation:
For N = 2, the correct sequence is
12 13 14 15 16 17 18 19 23 and so on 
up to 89.
 */



public class Lexo_Counting_Modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_Counting(0, 3);

	}

	public static void print_Counting(int curr, int n) {
		// +ve base case
		if (Integer.toString(curr).length() == n) {
			System.out.println(curr);
			return;
		}
		// -ve base Case
//		if (Integer.toString(curr).length() > n) {
//			return;
//		}

		int i = 0;
		int ld = curr % 10;
		
		i = ld + 1;
		for (; i <= 9; i++) {
			print_Counting(curr * 10 + i, n);
		}
	}

}
