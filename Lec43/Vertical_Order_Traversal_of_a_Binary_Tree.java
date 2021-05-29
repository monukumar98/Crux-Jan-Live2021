package Lec43;

import java.util.Scanner;
import java.util.TreeMap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;;

public class Vertical_Order_Traversal_of_a_Binary_Tree {

	static Scanner sc = new Scanner(System.in);

	private class Node {
		Node left;
		Node right;
		int data;
	}

	private Node root;

	public Vertical_Order_Traversal_of_a_Binary_Tree() {
		// TODO Auto-generated constructor stub
		this.root = createNode();
	}

	private Node createNode() {
		int d = sc.nextInt();
		LinkedList<Node> q = new LinkedList<>();
		Node nn = new Node();
		nn.data = d;
		this.root = nn;
		q.add(root);
		while (!q.isEmpty()) {
			Node node = q.getFirst();
			q.removeFirst();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				nn = new Node();
				nn.data = c1;
				node.left = nn;
				q.addLast(node.left);
			}

			if (c2 != -1) {
				nn = new Node();
				nn.data = c2;
				node.right = nn;
				q.addLast(node.right);

			}

		}
		return root;

	}

	public void display() {

		display(this.root);

	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += "<--";
		str += node.data + "-->";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	private class Pair {
		Node node;
		int vtl;
		int hl;

		public Pair(Node node, int vtl, int hl) {
			// TODO Auto-generated constructor stub
			this.node = node;
			this.vtl = vtl;
			this.hl = hl;
		}

	}

	public void verticalTraversal() {
		verticalTraversal(this.root);
	}

	private ArrayList<ArrayList<Integer>> verticalTraversal(Node node) {
		TreeMap<Integer, ArrayList<Pair>> map = new TreeMap<>();
		LinkedList<Pair> q = new LinkedList<>();
		q.add(new Pair(node, 0, 0));
		while (!q.isEmpty()) {
			Pair rp = q.removeFirst();
			if (!map.containsKey(rp.vtl)) {
				map.put(rp.vtl, new ArrayList<Pair>());
			}
			map.get(rp.vtl).add(rp);
			if (rp.node.left != null) {
				Pair lcp = new Pair(rp.node.left, rp.vtl - 1, rp.hl + 1);
				q.add(lcp);

			}
			if (rp.node.right != null) {
				Pair rcp = new Pair(rp.node.right, rp.vtl + 1, rp.hl + 1);
				q.add(rcp);
			}
		}
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for (int key : map.keySet()) {
			ArrayList<Pair> ll = map.get(key);

			Collections.sort(ll, new Comparator<>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					if (o1.hl == o2.hl) {
						return o1.node.data - o2.node.data;
					}
					return 0;
				}
			});

			ArrayList<Integer> ll1 = new ArrayList<>();
			for (Pair p : ll) {
				ll1.add(p.node.data);
			}
			list.add(ll1);
		}
		return list;

	}

}
