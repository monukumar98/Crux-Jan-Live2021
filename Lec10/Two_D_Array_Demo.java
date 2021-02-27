package Lec10;

public class Two_D_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = null;
		//int a=9;
		
		System.out.println(arr);
		arr = new int [3][4];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// row
		System.out.println(arr.length);
		// col 
		System.out.println(arr[0].length);
		arr[1][3]=7;
		for (int i = 0; i < arr.length; i++) {
			//int [] a = arr[i];
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		// E_F_L
		System.out.println("E_F_L");
		for(int [] val : arr) {
			for(int ans : val) {
				System.out.print(ans+" ");
			}
			System.out.println();
		}

	}

}
