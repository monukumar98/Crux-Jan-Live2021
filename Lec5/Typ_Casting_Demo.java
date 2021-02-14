package Lec5;

public class Typ_Casting_Demo {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		
		// b= (byte)(b+1)
//		char ch='a';
//		int i =  (ch+1);
//		System.out.println(i);
//		ch++;// ch = (char) (ch+1)
//		System.out.println(ch);
//		for(byte b =1; b<=128; b++) {
//			System.out.println(b);
//		}

		for(byte b =1; b<=126; b=(byte) (b+1)) {
		System.out.println(b);
//		if(b==127) {
//			break;
//		}
	}
	

	}

}
