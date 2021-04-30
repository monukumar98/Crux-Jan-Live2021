package Lec33;

public class Check_ithbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     if(is_set(84, 3)) {
    	 System.out.println(1);
     }
     else {
    	 System.out.println(0);
     }
	}

	public static boolean is_set(int n, int i) {
		int mask = (1 << i - 1);
		if ((mask & n) == 0) {
			return false;
		}
		return true;
	}

}
