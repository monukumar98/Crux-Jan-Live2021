package Lec42;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class K_Sorted_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		
		list.get(0).add(10);
		list.get(0).add(20);
		list.get(0).add(30);
		list.get(1).add(15);
		list.get(1).add(35);
		list.get(2).add(7);
		list.get(2).add(12);
		list.get(2).add(25);
		list.get(3).add(17);
		list.get(3).add(22);
		list.get(3).add(40);
		System.out.println(list);
		System.out.println(ksortedList2(list));
		

	}
	private static class  Pair implements Comparable<Pair>{
		 int val;
		 int listno;
		 int idx;
		 public Pair(int val, int listno, int idx) {
			// TODO Auto-generated constructor stub
			 this.val=val;
			 this.idx=idx;
			 this.listno=listno;
		}
		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			
			return this.val-o.val;
		}
		
	}

	public static ArrayList<Integer> ksortedList(ArrayList<ArrayList<Integer>> list){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		Generic_Heap<Pair> hp = new Generic_Heap<>();
		for(int i=0; i<list.size(); i++) {
			Pair p = new Pair(list.get(i).get(0), i, 0);
			hp.add(p);
		}
		while(!hp.isEmpty()) {
			Pair rp = hp.remove();
			ans.add(rp.val);
			rp.idx++;
			if(rp.idx<list.get(rp.listno).size()) {
				rp.val=list.get(rp.listno).get(rp.idx);
				hp.add(rp);
			}
		}
		return ans;
	}
	public static ArrayList<Integer> ksortedList2(ArrayList<ArrayList<Integer>> list){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		PriorityQueue<Pair> hp = new PriorityQueue<>( new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return o1.val-o2.val;
			}
		});
		for(int i=0; i<list.size(); i++) {
			Pair p = new Pair(list.get(i).get(0), i, 0);
			hp.add(p);
		}
		while(!hp.isEmpty()) {
			Pair rp = hp.remove();
			ans.add(rp.val);
			rp.idx++;
			if(rp.idx<list.get(rp.listno).size()) {
				rp.val=list.get(rp.listno).get(rp.idx);
				hp.add(rp);
			}
		}
		return ans;
	}
}
