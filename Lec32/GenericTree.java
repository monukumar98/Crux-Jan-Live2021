package Lec32;

import java.util.*;

public class GenericTree {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {
		// TODO Auto-generated constructor stub
		this.root = Createtree(null, -1);
	}

	private Node Createtree(Node parent, int ith) {
		// TODO Auto-generated method stub
		if (parent == null) {
			System.out.println("Enter Root Node data");
		} else
			System.out.println("Enter data  for " + ith + "child of " + parent.data);
		int item = sc.nextInt();
		Node node = new Node();
		node.data = item;
		System.out.println("Enter no of chlid ?? " + item);
		int noc = sc.nextInt();
		for (int i = 0; i < noc; i++) {
			Node child = Createtree(node, i);
			node.children.add(child);
		}
		return node;
	}

	public void Display() {
		Display(this.root);
	}

	private void Display(Node node) {
		// TODO Auto-generated method stub
		String str = "";
		str += node.data + "-->";

		for (Node child : node.children) {
			str = str + child.data + ",";
		}
		str += ".";
		System.out.println(str);
		for (Node child : node.children) {
			Display(child);
		}

	}

	public int szie() {
		return size(this.root);
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		int th = 0;
		for (Node child : node.children) {
			int ch = size(child);
			th += ch;
		}
		return th + 1;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		int th = -1;
		for (Node child : node.children) {
			int ch = ht(child);
			th = Math.max(ch, th);
		}
		return th + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		int m = node.data;
		for (Node child : node.children) {
			int cm = max(child);
			m = Math.max(cm, m);
		}
		return m;

	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node.data == item) {
			return true;
		}
		for (Node child : node.children) {
			boolean isfind = find(child, item);
			if (isfind) {
				return isfind;
			}
		}
		return false;
	}

	public void perOrder() {
		perOrder(this.root);
		System.out.println();
	}

	private void perOrder(Node node) {
		// TODO Auto-generated method stub
		System.out.print(node.data + " ");
		for (Node child : node.children) {
			perOrder(child);
		}

	}

	public void postOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node node) {
		// TODO Auto-generated method stub

		for (Node child : node.children) {
			postOrder(child);
		}
		System.out.print(node.data + " ");
	}

	public void levelOrder() {
		levelOrder(this.root);
		System.out.println();
	}

	private void levelOrder(Node node) {
		// TODO Auto-generated method stub
		LinkedList<Node> Queue = new LinkedList<>();
		Queue.add(node);
		while (!Queue.isEmpty()) {
			Node rn = Queue.removeFirst();
			System.out.print(rn.data + " ");
			for (Node child : rn.children) {

				Queue.add(child);
			}

		}

	}

	public void printlevelwise() {
		printlevelwise(this.root);
	}

	private void printlevelwise(Node node) {
		// TODO Auto-generated method stub
		LinkedList<Node> Queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();
		Queue.add(node);
		while (!Queue.isEmpty()) {
			Node rn = Queue.removeFirst();
			System.out.print(rn.data + " ");
			for (Node child : rn.children) {

				helper.add(child);
			}
			if (Queue.isEmpty()) {
				System.out.println();
				Queue = helper;
				helper = new LinkedList<>();
			}

		}

	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {
		// TODO Auto-generated method stub
		for (Node child : node.children) {
			mirror(child);
		}
//		int l=0;
//		int r = node.children.size()-1;
//		while(l<r) {
//			Node leftnode = node.children.get(l);
//			Node rightnode=node.children.get(r);
//			node.children.set(r, leftnode);
//			node.children.set(l, rightnode);
//			l++;
//			r--;
//		}
		Collections.reverse(node.children);

	}

	public void linearize() {
		linearize(this.root);
	}

	private void linearize(Node node) {
		// TODO Auto-generated method stub
		for (Node child : node.children) {
			linearize(child);
		}
		while (node.children.size() > 1) {
			Node temp = node.children.remove(1);
			Node tail = Get_Tail(node.children.get(0));
			tail.children.add(temp);
		}

	}

	private Node Get_Tail(Node node) {
		// TODO Auto-generated method stub
		if(node.children.size()==0) {
			return node;
		}
		return Get_Tail(node.children.get(0));
	}
}
