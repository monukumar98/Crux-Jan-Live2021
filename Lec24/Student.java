package Lec24;

public class Student {
	
  String name="Amit";
   int age=90;
    
    public Student() {
    	this.age=19;
    	this.name="Loop";
    }
    public Student(String name, int age) {
    	this.name=name;
    	this.age=age;
    }
    public void introduceYourself() {
    	System.out.println("My name is "+name +" and age "+age);
    }
    
    protected void introduceYourself(String name) {
    	int roll_no=12;
    	System.out.println("My name is "+this.name +" and age "+this.age);
    }
    
}
