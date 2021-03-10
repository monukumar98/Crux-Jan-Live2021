package Lec7;


public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,3,2,1,4};
		//Arrays.sort(arr);
	     Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Sort(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			 int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			// swap (n-1)
			int t = arr[i];
			arr[i]=arr[min];
			arr[min]=t;
		}
	}

}
