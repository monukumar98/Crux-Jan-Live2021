package Doubt_live;

import java.util.Scanner;

public class input_sum {
	public static void main(String[] args) {
		Scanner scn  =new Scanner(System.in);
		int sum=0;
		while(sum>=0) {
			int input = scn.nextInt();
			sum =sum+input;
//			System.out.println("Number : "+input+ " : " +sum);
			if(sum>=0) {
				System.out.println(input);
			}
		}
		
	}
}
