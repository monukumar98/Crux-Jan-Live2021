package Lec16;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice_Problem(0, 4, "");

	}

	public static void Dice_Problem(int curr, int end, String ans) {
		// TODO Auto-generated method stub
		if(curr==end) {
			System.out.println(ans);
			return;
		}
		
		for(int dice=1; dice<=6 && dice+curr<=end; dice++) {
		Dice_Problem(curr+dice, end, ans+dice);
		}
		
	}

}
