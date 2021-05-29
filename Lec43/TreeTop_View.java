package Lec43;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.LinkedList;;

public class TreeTop_View {
	static Scanner sc = new Scanner(System.in);

	private class Node {
		Node left;
		Node right;
		int data;
	}

	private Node root;

	public TreeTop_View() {
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

	private void Topview() {
		// TODO Auto-generated method stub
		TreeMap<Integer, Pair> map = new TreeMap<>();
		Topview(this.root, 0, 0, map);
		for(Integer val : map.keySet()) {
			System.out.print(map.get(val).node.data+" ");
		}

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

	private void Topview(Node node, int vl, int chl, TreeMap<Integer, Pair> map) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		if (!map.containsKey(vl) ||  chl<map.get(vl).hl) {
			Pair p = new Pair(node, vl, chl);
			map.put(vl, p);
		}
		Topview(node.left, vl - 1, chl+1, map);
		Topview(node.right, vl + 1,chl+1, map);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeTop_View bl = new TreeTop_View();
		bl.Topview();

	}

}