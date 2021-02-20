package Lec7;

public class Fast_Raotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 8, 7, 6, 5, 2, 34, 1 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Rotate(arr, 5);
		System.out.println();
		System.out.println("................");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	public  static void Rotate(int[] arr, int k) {
		// TODO Auto-generated method stub
		k=(k%arr.length);
		int j = arr.length-k-1;
		System.out.println("........................");
		Revser(arr, 0, j);
		Display(arr);
		System.out.println();
		System.out.println("........................");
		Revser(arr, j+1, arr.length-1);
		Display(arr);
		System.out.println();
		System.out.println("........................");
		
		Revser(arr, 0, arr.length-1);
		
	}
	public static void Revser(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}

	}
	public static void swap(int[] arr, int i, int j) {
		int tamp = arr[i];
		arr[i] = arr[j];
		arr[j] = tamp;

	}
	public static void Display(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
