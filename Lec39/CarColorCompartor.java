package Lec39;

import java.util.Comparator;

public class CarColorCompartor implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return o1.Color.compareTo(o2.Color);
	}

}
