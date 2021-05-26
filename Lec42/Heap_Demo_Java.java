package Lec42;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Demo_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pqmin =  new PriorityQueue<>();// Min Heap
		pqmin.add(90);
		pqmin.add(80);
		pqmin.add(100);
		pqmin.add(89);
		System.out.println(pqmin);
		PriorityQueue<Integer> pqmax =  new PriorityQueue<>(Collections.reverseOrder());// MaxHeap
		pqmax.add(90);
		pqmax.add(80);
		pqmax.add(100);
		pqmax.add(89);
		System.out.println(pqmax);
		
		

	}

}
