package Lec11;

import java.util.ArrayList;

public class Intersction_of_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,5,8,9,11,13,13,15};
		int [] arr1= {4,5,7,8,9,10,13,13,15,17,18};
		int i=0;
		int j=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i<arr.length && j<arr1.length) {
			if(arr[i]==arr1[j]) {
				list.add(arr[i]);
				i++; j++;
			}
			else if(arr[i]<arr1[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		if(list.size()==0) {
			System.out.println("khaali hai");
		}
		System.out.println(list);

	}

}
