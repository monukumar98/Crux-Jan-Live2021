package Lec39;

public class Car { //implements Comparable<Car> 
	String Color;
	int price;
	int speed;
	 public Car() {
		// TODO Auto-generated constructor stub
	}
	 public Car(int price, int speed,String color) {
		// TODO Auto-generated method stub\
		 this.price=price;
		 this.speed=speed;
		 this.Color=color;
		 

	}
	 @Override
	 public String toString() {
		return "P : "+this.price+" S: "+this.speed+" C: "+this.Color;
	 }
//	@Override
//	public int compareTo(Car o) {
//		// TODO Auto-generated method stub
//		//return o.price-this.price;
//		//return this.speed-o.speed;
//		return this.Color.compareTo(o.Color);
//		
//	}
}
