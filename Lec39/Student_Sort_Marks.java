package Lec39;

import java.util.Arrays;

public class Student_Sort_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pair[] arr = new pair[5];
		arr[0] = new pair("sham", 89);
		arr[1] = new pair("pooja", 97);
		arr[2] = new pair("rahul", 65);
		arr[3] = new pair("mohan", 77);
		arr[4] = new pair("rohan", 56);
//    Arrays.sort(arr, new Comparator<pair>() {
//
//		@Override
//		public int compare(pair o1, pair o2) {
//			// TODO Auto-generated method stub
//			return o1.marks-o2.marks;
//		}
//	});

		//Arrays.sort(arr);
		
System.out.println(Arrays.toString(arr));
	}

	private static class pair implements Comparable<pair> {
		String name;
		int marks;

		public pair() {
			// TODO Auto-generated constructor stub
			this.name = "";
			this.marks = 0;
		}

		public pair(String name, int roll_no) {

			this.name = name;
			this.marks = roll_no;
		}

		@Override
		public String toString() {
			return this.name + " -> " + this.marks;
		}

		@Override
		public int compareTo(pair o2) {
			// TODO Auto-generated method stub
			return this.marks - o2.marks;
		}

	}
}
