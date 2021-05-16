package Lec40;

import java.util.*;

public class Sort_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Employees> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int salary = sc.nextInt();
			if (salary >= x) {
				list.add(new Employees(name, salary));
			}
		}

		Collections.sort(list, new Comparator<Employees>() {

			@Override
			public int compare(Employees o1, Employees o2) {
				// TODO Auto-generated method stub
				if (o1.salary == o2.salary) {
					return o1.name.compareTo(o2.name);
				} else {
					return o2.salary - o1.salary;
				}
			}
		});

		System.out.println(list);
	}

	private static class Employees {
		String name;
		int salary;

		public Employees(String name, int salary) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.salary = salary;
		}

		@Override

		public String toString() {
			return this.name + " " + this.salary;
		}
	}
}
