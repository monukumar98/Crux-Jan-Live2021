package Lec25;

public class Person {
	private String name = "Kunal";
	private int age = 90;
	public final int idx = 90;
	static int ll=98;

	public String getName() {

		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {

		return this.age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("Invalid Age");
		}

		this.age = age;

	}

	public void setAge1(int age) {

		try {
			if (age < 0) {
				throw new Exception("-ve age");
			}
			this.age = age;

		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();

		} finally {
			System.out.println(" i am in finally block");
		}

	}

	static {
		System.out.println("Hey I am in static");
	}

	public void fun() {
		System.out.println("IN Fun");

	}

}
