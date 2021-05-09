package Lec38;

public class Genri_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {1,2,3,4,5};
		display(arr);
		String [] arrs= {"hey","bye","hello"};
		display(arrs);
		int [] ar = {1,2,4};
		

	}
	public static <T>void display(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	

}
