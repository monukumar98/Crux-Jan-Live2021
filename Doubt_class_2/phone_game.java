package Doubt_class_2_live;

import java.util.Scanner;

public class phone_game {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int test = scn.nextInt();
		for (int i = 0; i < test; i++) {
			game();
		}
	}
	public static void game() {
		int P1 = scn.nextInt();
		int P2 = scn.nextInt();
		int curr_p1 = 0, curr_p2 = 0, phone = 1;
		while (true) {
			curr_p1 = curr_p1 + phone;
			phone++;
			curr_p2 = curr_p2 + phone;
			phone++;
			if (curr_p1 > P1) {
//				P1 lose
				System.out.println("Harshit");
				break;
			}
			if (curr_p2 > P2) {
//				P2 lose
				System.out.println("Aayush");
				break;
			}
		}
	}
}
