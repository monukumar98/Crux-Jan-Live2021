package Lec26;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// P p = new P();
		// C c = new C();
		// Case 1
		System.out.println(".............Case 1...........");
		P obj = new P();
		System.out.println(obj.d);// 1
		System.out.println(obj.d1);// 100
		obj.fun();// p
		obj.fun1();// p

		// Case 2
		System.out.println(".............Case 2...........");
		P obj1 = new C();
		System.out.println(obj1.d);// 1
		System.out.println(obj1.d1);// 100
		System.out.println(((C) obj1).d);// 2
		System.out.println(((C) obj1).d2);// 200
		((P) (obj1)).fun();//
		obj1.fun1();// p
		((C) obj1).fun2();
		// Case 3
//		System.out.println(".............Case 3...........");
//		C obj3 = new P();
//		System.out.println(obj3.d);
//		System.out.println(obj3.d1);
//		System.out.println(obj3.d2);
//		obj3.fun();
//		obj3.fun1();
//		obj3.fun2();
		// Case 4
		System.out.println(".............Case 4...........");
		C obj4 = new C();
		System.out.println(obj4.d);//c
		System.out.println(obj4.d1);//p
		System.out.println(((P) obj1).d);// p
		System.out.println(obj4.d2);//c
		obj4.fun();//c
		obj4.fun1();//p
		obj4.fun2();//c



	}

}
