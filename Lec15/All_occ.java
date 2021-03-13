package Lec15;

public class All_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,3,1,4,5,1,8,1,9};
               all_occ(arr,0,1);
               System.out.println();
               int ans[]  = all_occMethod2(arr, 0, 1, 0);
               for(int val : ans) {
            	   System.out.print(val+" ");
               }
	}

	public static void all_occ(int[] arr, int i, int k) {
		// TODO Auto-generated method stub
		// Base Case
		if(i==arr.length) {
			return ;
		}
		if(arr[i]==k) {
			System.out.print(i+" ");
		}
		all_occ(arr, i+1, k);
		
		
	}
	public static int [] all_occMethod2(int[] arr, int i, int item,int count) {
		// TODO Auto-generated method stub
		// Base Case
		if(i==arr.length) {
			int [] ans = new int [count];
			return ans; 
		}
		if(arr[i]==item) {
			count++;
		}
		int [] index_arr = all_occMethod2(arr, i+1, item,count);
		if(arr[i]==item) {
			index_arr[count-1]=i;
		}
		return index_arr;
		
	}
}
