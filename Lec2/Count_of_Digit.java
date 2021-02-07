package Lec2;

public class Count_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 38682;
		//2^5
		int pow= (int) Math.pow(2, 5);
		System.out.println(pow);
		int counter =0;
		while(n>0) {
			n=n/10;
			counter++;
		}
		System.out.println(counter);
		

	}

}
