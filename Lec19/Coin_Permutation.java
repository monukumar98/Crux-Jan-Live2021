package Lec19;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Coin = {  2, 3, 5 };
		int ammount = 10;
		Coin_Changes(Coin, ammount, "");
	}

	public static void Coin_Changes(int coin[], int ammount, String ans) {

		if (ammount == 0) {
			System.out.println(ans);
			return;
		}

		for (int j = 0; j < coin.length; j++) {
			if (ammount - coin[j] >= 0) {
				Coin_Changes(coin, ammount - coin[j], ans + coin[j]);
			}
		}
	}
}
