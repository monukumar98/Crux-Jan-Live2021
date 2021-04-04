package Lec24;

public class Student_Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();

		s.age = 10;
		s.name = "Kaju";

		Student s1 = s;
		Student s2 = new Student();
		s2.age = -30;
		s2.name = "Kunal";
		Student s3 = new Student();
		s3.age = 25;
		s3.name = "Hardik";

		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);
		System.out.println("................");
		// Test1(s2, s3);
		// Test2(s2, s3);
		int myAge = 19;
		String myName = "IPL";
		// Test3(s2, s3.age, s3.name, myAge, myName);
		System.out.println("................");
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);
		s2.introduceYourself();
		s.introduceYourself();
		s3.introduceYourself();
		s2.introduceYourself("Hitman");
		Student s4 = new Student("Dhoni", 39);
		System.out.println(s4.name + " " + s4.age);

	}

	public static void Test3(Student s, int age, String name, int myAge, String myName) {
		s.age = 0;
		s.name = "_";
		age = 0;
		name = "_";
		myAge = 0;
		myName = "_";
	}

	public static void Test2(Student s2, Student s3) {

		s2 = new Student();
		int tempa = s2.age;
		s2.age = s3.age;
		s3.age = tempa;

		s3 = new Student();
		String tempn = s2.name;
		s2.name = s3.name;
		s3.name = tempn;
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);

	}

	public static void Test1(Student s2, Student s3) {
		Student t = s2;
		s2 = s3;
		s3 = t;
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);
	}
}
