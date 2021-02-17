package Lec6;

public class Swap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		arr[9]=-1;
//		System.out.println(arr.length);
//		arr[1]=-90;
//		int [] other = arr;
//		System.out.println(arr[1]);
//		System.out.println(other[1]);
		int[] arr = { 10, 20, 30, 40, 50, 90, 89, 90 };
		int[] other = { 100, 200, 300, 400 };
//		System.out.println(other[0] + " " + arr[0]);
		// Case 1: Swap
//		Swap1(arr[0], other[0]);
		System.out.println(other[0] + " " + arr[0]);

		// Case 2: swap
        Swap2(arr,other,0 );
        System.out.println(other[0] + " " + arr[0]);
//		System.out.println(arr[0]+" "+arr[1]);
//		Swap3(arr, 0, 1);
//		System.out.println(arr[0]+" "+arr[1]);

		
	}
	public static void Swap2(int []one,int []two,int i) {

		int t = one[i];
		one[i] = two[i];
		two[i] = t;
	}
	// original me changes hoga 
	public static void Swap3(int []arr, int i,int j) {

		int t = arr[i];
		arr[i] = arr[j];
		arr[j]= t;
	}
	public static void Swap1(int a, int b) {

		int t = a;
		a = b;
		b = t;
	}

	

}
