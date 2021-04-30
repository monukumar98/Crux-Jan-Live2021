package Lec33;

public class Clear_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(clearbit(85, 3));

	}
	public static int clearbit(int n , int i) {
		int mask = 1<<(i-1);
		mask=~mask;
		return n&mask;
	}

}
