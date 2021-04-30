package Lec33;

public class Unique_Number_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 3, 7, 7, 6, 5 };

		System.out.println(Unique_NumberI(arr));
	}

	public static int Unique_NumberI(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];// ans = ans ^arr[i];
		}
		return ans;

	}

}
