package Lec12;

public class String_Builder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("abcd");
//	StringBuilder sb1 = new StringBuilder("monu");
//        System.out.println(sb==sb1);
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append('p');
		System.out.println(sb);
		sb.insert(2, 'c');
		System.out.println(sb);
		System.out.println(sb.length());
		//sb.reverse();
		System.out.println(sb);
		sb.setCharAt(3, 't');
		System.out.println(sb);
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(2, 4));
		System.out.println(sb);
		//sb.delete(0, 2);
		//sb.deleteCharAt(2);
		System.out.println(sb);
	//	System.out.println(sb.substring(2, 15));
		long start  = System.currentTimeMillis();
		//fun();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		

	}

	private static void fun() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100000; i++) {
			sb.append(i);
		}
		System.out.println(sb);
		
	}
	

}
