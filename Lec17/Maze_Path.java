package Lec17;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		// mazepath(0,0, m-1,n-1,"");
		
		mazepath_D(0, 0, 2, 2, "");
		System.out.println(m);
	}

	public static void mazepath(int cr, int cc, int er, int ec, String ans) {
		// TODO Auto-generated method stub
		if (cc == ec && cr == er) {
			System.out.println(ans);
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}
		mazepath(cr, cc + 1, er, ec, ans + "H");
		mazepath(cr + 1, cc, er, ec, ans + "V");

	}

	public static void mazepath_D(int cr, int cc, int er, int ec, String ans) {
		// TODO Auto-generated method stub
		if (cc == ec && cr == er) {
			System.out.println(ans);
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}
		
		

		mazepath_D(cr, cc + 1, er, ec, ans + "H");
		mazepath_D(cr + 1, cc, er, ec, ans + "V");
		if (cc == cr) {
			mazepath_D(cr + 1, cc + 1, er, ec, ans + "D");
			// System.out.println("hey");
		}
		
	}

}
