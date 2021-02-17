package Lec6;

public class Swap_Demo_4 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int brr[] = { 100, 200, 300, 400, 500 };
		System.out.println(arr[0] + " " + brr[0]);
		swap(arr, brr);
		System.out.println(arr[0] + " " + brr[0]);

	}
       // refrence swap
	public static void swap(int[] arr, int[] brr) {
		int[] t = arr;
		arr = brr;
		brr = t;

	}

}
