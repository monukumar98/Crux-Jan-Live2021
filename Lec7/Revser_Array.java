package Lec7;

public class Revser_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,8,7,6,5,2,34,1};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Revser(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Revser(int []arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void swap(int []arr,int i,int j) {
		int tamp = arr[i];
		arr[i]=arr[j];
		arr[j]=tamp;
		
	}

}
