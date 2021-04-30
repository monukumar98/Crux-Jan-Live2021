package Lec33;

public class Count_setbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countsetbit(887967874));
		System.out.println(count_fast_setbit(84));
	}

// 32 times
	public static int countsetbit(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}
	// O(Number set bit)
	public static int count_fast_setbit(int n) {
		int count = 0;
		while (n != 0) {
		    count++;
		    n=(n&(n-1));
		}
		return count;
	}

}
