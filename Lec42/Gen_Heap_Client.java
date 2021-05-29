package Lec42;

import Lec39.Car;

public class Gen_Heap_Client {
	public static void main(String[] args) {
		Car[] cars = new Car[5];
		// display(cars);
		cars[0] = new Car(1000, 135, "Black");
		cars[1] = new Car(2000, 190, "White");
		cars[2] = new Car(3450, 30, "Yellow");
		cars[3] = new Car(8907, 60, "Red");
		cars[4] = new Car(3400, 89, "Grey");
		Generic_Heap<Car> gnp = new Generic_Heap<>();
		gnp.add(cars[0]);
		gnp.add(cars[1]);
		gnp.add(cars[2]);
		gnp.add(cars[3]);
		gnp.add(cars[4]);
		
		System.out.println(gnp.get());
	}
}
