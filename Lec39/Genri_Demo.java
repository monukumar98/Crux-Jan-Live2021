package Lec39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Genri_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] arr = { 1, 2, 3, 4, 5 };
//		display(arr);
//		String[] arrs = { "hey", "bye", "hello" };
//		display(arrs);
//		int[] ar = { 1, 2, 4 };
//		Long ll[] = { 1L, 2L, 3L, 4L };
//		display(ll);

		Car[] cars = new Car[5];
		// display(cars);
		cars[0] = new Car(1000, 135, "Black");
		cars[1] = new Car(2000, 100, "White");
		cars[2] = new Car(3450, 30, "Yellow");
		cars[3] = new Car(8907, 60, "Red");
		cars[4] = new Car(3400, 89, "Grey");
		display(cars);
//		Bubble_Sort(cars , new CarSpeedComparator());
//		display(cars);
//    	Bubble_Sort(cars , new CarPriceComparator());
//		display(cars);
		Bubble_Sort(cars , new CarColorCompartor());
		display(cars);
		 Arrays.sort(cars, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				return o1.speed-o2.speed;
			}
		});
		 System.out.println(Arrays.toString(cars));
	
//		

	}

	public static <T> void display(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> void Bubble_Sort(T []arr) {
		for (int pass = 1; pass < arr.length; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if (arr[j].compareTo(arr[j + 1])>0) {
					T tamp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tamp;
				}
			}

		}
	}

	public static  void Bubble_Sort(Car []arr,CarColorCompartor camp) {
		for (int pass = 1; pass < arr.length; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if (camp.compare(arr[j], arr[j+1])>0) {
					Car tamp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tamp;
				}
			}

		}
	}
	
	

}
