package Lec5;

public class Local_Gol {
    static int val =100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		additon();
		System.out.println(val);
		System.out.println(add());

	}
	public static int add() {
		return val;
	}
	public static void additon() {
		int a = 10;
		int b = 20;
		  System.out.println(val);
		val= val+18;
     
       int val = 10;
       System.out.println(val);
		int c = a + b;
		//additonpara(a, 80);
		System.out.println(c);
	}
	public static void additonpara(int x, int y) {
		System.out.println(val);
		int c = x + y;
		if (c == 30)
			return;
		System.out.println(c);

	}


}
