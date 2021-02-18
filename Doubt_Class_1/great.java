package Doubt_live;

import java.util.Scanner;

public class great {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		for(int i=1;i<=4;i++) {
			int input = scn.nextInt();
			if(input>num) {
				num=input;
			}
		}
		System.out.println(num);
		
		
	}

}
