package Lec7;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = { 5,4,1,2,3};
		int[] arr1 = { 1, 2, 3, 5,4};
		// Sort(arr);
		Sort_OPtimize(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

	}

	public static void Sort(int[] arr) {
		for (int pass = 1; pass < arr.length; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}

		}
	}

public static void Sort_OPtimize(int []arr) {
	boolean flag = true;
	
	 for (int pass = 1; pass < arr.length; pass++) {
		 System.out.println("pass"+" "+pass);
		 for(int j=0; j<arr.length-pass; j++) {
			 if(arr[j]>arr[j+1]) {
				swap(arr, j, j+1); 
				flag=false;
			 }
			 
		 }
		 if(flag) {
			 break;
		 }
		 flag=true;
		
		
	}
}

	public static void swap(int[] arr, int i, int j) {
		int tamp = arr[i];
		arr[i] = arr[j];
		arr[j] = tamp;

	}

}
