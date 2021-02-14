package Lec5;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =5;
		System.out.println(a+" "+b);
		Swap(a, b);
		System.out.println(a+" "+b);
		

	}
	public static void Swap(int a,int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);

	}

}
