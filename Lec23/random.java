package Lec23;

import java.util.Random;

import Lec24.Student;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random(2, 100);
		Student s = new Student();
		

	}
	static void random( int low, int high) {

		Random rand = new Random();
		for(int i=1; i<=10; i++) {
		int pivot = rand.nextInt(high- low) + low;

		System.out.println(pivot);
		}
	}
}
