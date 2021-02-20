package Lec7;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 8, 7, 6, 5, 2, 34, 1 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		Rotate(arr, 16);
		System.out.println();
		System.out.println("................");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	public static void Rotate(int []arr, int k) {
		
		 k=(k%arr.length);
		for(int rot=1; rot<=k; rot++) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-1; i>=1; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		}
	}

}
