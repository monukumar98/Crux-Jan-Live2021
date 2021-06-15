package Lec2;

public class Max_dot_Profuct_of_Two_Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -5, -1, -2 };
		int arr1[] = { 3, 5, 5, 5 };
		System.out.println(Mdpofts(arr, arr1, 0, 0, 0));
		int [][] dp=new int [arr.length][arr1.length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j]=-100000;
			}
		}
		System.out.println(MdpoftsTD(arr, arr1, 0, 0, 0, dp));

	}

	public static int Mdpofts(int[] arr, int arr1[], int i1, int i2, int counter) {
		if (i1 == arr.length || i2 == arr1.length) {
			if (counter == 1)
				return 0;
			else {
				return -1000000;
			}
		}

		int take_dot = arr[i1] * arr1[i2] + Mdpofts(arr, arr1, i1 + 1, i2 + 1, 1);
		int fa = Mdpofts(arr, arr1, i1 + 1, i2, 0);
		int sa = Mdpofts(arr, arr1, i1, i2 + 1, 0);
		return Math.max(take_dot, Math.max(fa, Math.max(sa, arr[i1] * arr1[i2])));

	}

	public static int MdpoftsTD(int[] arr, int arr1[], int i1, int i2, int counter, int[][] dp) {
		if (i1 == arr.length || i2 == arr1.length) {
			if (counter == 1)
				return 0;
			else {
				return -1000000;
			}
		}
		if (dp[i1][i2] != -100000) {
           return dp[i1][i2];
		}
		int take_dot = arr[i1] * arr1[i2] + MdpoftsTD(arr, arr1, i1 + 1, i2 + 1, 1, dp);
		int fa = MdpoftsTD(arr, arr1, i1 + 1, i2, 0, dp);
		int sa = MdpoftsTD(arr, arr1, i1, i2 + 1, 0, dp);
		return dp[i1][i2] = Math.max(take_dot, Math.max(fa, Math.max(sa, arr[i1] * arr1[i2])));

	}
	

}
