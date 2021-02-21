package Lec8;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,4,3,2,1};
		
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Sort(int []arr) {
		for (int conter = 1; conter < arr.length; conter++) {
			int j = conter-1;
			int item = arr[conter];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
			
		}
	}

}
