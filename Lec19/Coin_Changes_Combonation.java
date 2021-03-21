package Lec19;

public class Coin_Changes_Combonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Coin = { 1,2, 3, 5 };
		int ammount =10;
		Coin_Changes(Coin, ammount, "", 0);
		
	}
	public static void Coin_Changes(int coin[],int ammount,String ans,int i ) {
		
		if(ammount==0) {
			System.out.println(ans);
			return;
		}
		
		for (int j = i; j < coin.length; j++) {
			if(ammount-coin[j]>=0) {
			Coin_Changes(coin, ammount-coin[j], ans+coin[j], i);
			}
		}
	}

}
