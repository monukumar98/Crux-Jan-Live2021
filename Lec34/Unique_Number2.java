package Lec34;

public class Unique_Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 7, 2, 5, 7 };
		uniquenumbertwo(arr);

	}

	public static void uniquenumbertwo(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		int mask = (ans & (~(ans - 1)));
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & mask) != 0) {
				a = a ^ arr[i];
			}
		}
		int b = a ^ ans;
		System.out.println(a + " " + b);

	}

}
