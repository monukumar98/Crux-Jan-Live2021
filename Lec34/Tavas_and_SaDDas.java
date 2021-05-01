package Lec34;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="4747";
		System.out.println(index_of_lucky_number(str));

	}
	public static  int index_of_lucky_number(String str) {
		// n-1 length ke lucky number
		int index=(1<<str.length())-2;
		int pos=0;
		
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)=='7') {
				index= index + (1<<pos);
			}
			pos++;
		}
		return index+1;
	}

}
