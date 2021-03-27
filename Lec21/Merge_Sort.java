package Lec21;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {8,2,6,7,1,5};
		arr=merge_sort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int [] merge_sort(int []arr,int si, int ei) {
		if(si==ei) {
			int [] bs = new int [1];
			bs[0]=arr[si];
			return bs;
		}
		
		int mid=(si+ei)/2;
		int []fs = merge_sort(arr, si, mid);
		int []sh=merge_sort(arr, mid+1, ei);
		return Mergetwosortedarray(fs, sh);
		
	}
	
	public static int [] Mergetwosortedarray(int []arr1,int []arr2) {
		int ans[] = new int [arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				k++;
				i++;
			}
			else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			ans[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
		
	}
}
