package Lec21;

public class Merege_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {2,3,5,7,9};
		int [] arr2= {1,4,6,7,8,9,10,11};
		int ans[] = Mergetwosortedarray(arr1, arr2);
		for(int val: ans) {
			System.out.print(val+" ");
		}

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
