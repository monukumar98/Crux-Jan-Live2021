package Lec25;

public class Person_Client {
	public static void main(String[] args)  {
		Person p= new Person();
		Person p1= new Person();
		p.setName("ViVo");
		System.out.println(p);
		System.out.println("Hey main");
		p.setAge1(20);
		System.out.println(Person.ll);
		System.out.println(" Hey I am in main ");
		System.out.println(p.getName()+" "+p.getAge());
		
	}


}
