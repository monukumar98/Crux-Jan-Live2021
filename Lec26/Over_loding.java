package Lec26;

public class Over_loding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(2,4));
		System.out.println(sum(2,3.0));
		int arr [] = {1,2,3,4,5,5,6,7,7,8,90};
		System.out.println(sum(arr));
	}
	
	public static int sum(int a, int b) {
		System.out.println("hey");
		return a+b;
	}
//	public static void sum(int a, int b) {
//		System.out.println("hey");
//		System.out.println(a+b);
//	}
	public static int sum(int a, double b) {
		System.out.println("bye");
		return (int) (a+b);
	}
	public static int sum(int ... arg) {
		int ans=0;
		for(int val :arg) {
			ans+=val;
		}
		return ans;
	}

}
