package Lec1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		// A marks >=75
		if(marks>=75) {
			System.out.println("Grade A");
		}
		else if(marks>=60 && marks<75) {
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("Grade C");
		}
		else if(marks>=40 && marks<50) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
		
		
		
		
		
		

	}

}
