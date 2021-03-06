package Lec42;

import java.util.*;

public class Heap {
	private ArrayList<Integer> data;

	public Heap() {
		// TODO Auto-generated constructor stub
		this.data = new ArrayList<Integer>();
	}

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void add(int item) {
		this.data.add(item);
		upheapify(this.data.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (this.data.get(ci) < this.data.get(pi)) {
			swap(ci, pi);
			upheapify(pi);
		}

	}

	public void swap(int i, int j) {
		int ith = this.data.get(i);
		int jth = this.data.get(j);
		this.data.set(i, jth);
		this.data.set(j, ith);

	}

	public int get() {
		return this.data.get(0);
	}

	public int remove() {
		int rd = this.data.get(0);
		swap(0, this.data.size() - 1);
		this.data.remove(this.data.size() - 1);
		downheapify(0);
		return rd;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < this.data.size() && this.data.get(lci) < this.data.get(mini)) {
			mini = lci;
		}
		if (rci < this.data.size() && this.data.get(rci) < this.data.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
            downheapify(mini);
		}

	}
	public void display() {
		System.out.println(this.data);
	}
}
