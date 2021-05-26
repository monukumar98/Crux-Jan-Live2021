package Lec42;

import java.util.*;

public class Generic_Heap<T extends Comparable<T>> {
	private ArrayList<T> data;

	public Generic_Heap() {
		// TODO Auto-generated constructor stub
		this.data = new ArrayList<>();
	}

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void add(T item) {
		this.data.add(item);
		upheapify(this.data.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (islarger(this.data.get(ci),this.data.get(pi))>0) {
			swap(ci, pi);
			upheapify(pi);
		}

	}

	public void swap(int i, int j) {
		T ith = this.data.get(i);
		T jth = this.data.get(j);
		this.data.set(i, jth);
		this.data.set(j, ith);

	}

	public T get() {
		return this.data.get(0);
	}

	public T remove() {
		T rd = this.data.get(0);
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
		if (lci < this.data.size() &&  islarger(this.data.get(lci) , this.data.get(mini))>0) {
			mini = lci;
		}
		if (rci < this.data.size() && islarger(this.data.get(rci) , this.data.get(mini))>0) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}
// t ka priority max 
	public int islarger(T t, T o) {
		return t.compareTo(o);
	}

	public void display() {
		System.out.println(this.data);
	}
}
