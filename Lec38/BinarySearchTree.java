package Lec38;

import java.util.Scanner;

public class BinarySearchTree {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinarySearchTree(int[] in) {
		// TODO Auto-generated constructor stub
		this.root = Create_tree(in, 0, in.length - 1);

	}

	private Node Create_tree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node node = new Node();
		node.data = in[mid];
		node.left = Create_tree(in, si, mid - 1);
		node.right = Create_tree(in, mid + 1, ei);
		return node;
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
		str += "<--" + node.data + "-->";

		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}

		System.out.println(str);
		display(node.left);
		display(node.right);
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (item == node.data) {
			return true;
		}
		if (node.data < item) {
			return find(node.right, item);
		} else {
			return find(node.left, item);
		}

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}

	public void addNode(int item) {
		this.root = addNode(this.root, item);
	}

	private Node addNode(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			Node nn = new Node();
			nn.data = item;
			node = nn;
			return node;
		}
		if (node.data < item) {
			node.right= addNode(node.right, item);
		} else {
			node.left= addNode(node.left, item);
		}
		return node;

	}
// 60 true 65 true 50 false false false true 70 false false 
}
