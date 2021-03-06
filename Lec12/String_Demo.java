package Lec12;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fun(2);
		String str = "Hello";// 3k
		String str1 = "Hello";// 3k
    //	str = str + "bye";// 5k
    //	str1=str1+"ok";// 7k
   //	System.out.println(str==str1);
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(10 + 20 + "Hello" + 30 + 40);
		System.out.println(str);
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(str.length() - 1));
		// Substring
		System.out.println(str.substring(2));
		// System.out.println(str.substring(2, 6));
		// System.out.println(str.substring(2, 10));// Error
		System.out.println("hey");
		String s1 = new String("hiiii");// 8k
		String s2 = new String("hiiii");// 9k
		// System.out.println(s1.concat("100"));
		System.out.println(s1);

		System.out.println(s1 == s2);
		System.out.println(str == str1);
		System.out.println(s1.equals(s2));
		System.out.println(str.equals(str1));
//		int a = 9;
//		int b = 9;

		System.out.println("..........");
		Integer a =-129;
		Integer b =-129;
		System.out.println(a == b);
		long start  = System.currentTimeMillis();
		fun();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		

	}

	public static void  fun() {
		int n=100000;
		String s= "";
		for (int i = 1; i <=n; i++) {
			s=s+i;
		}
		System.out.println(s);
		
	}
	

}
