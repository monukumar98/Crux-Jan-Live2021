package Lec4;

public class For_loop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method 1
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			
		}
		// method 2 
		int i=1;
		for(; i<=5; ) {
			System.out.println("Hey");
			i++;
		}
		for(; ;) {
			System.out.println("bye");
		}
		
		
		//  infinite  loop
//		while(true) {
//			System.out.println("hey");
//		}

	}

}
