package Lec37;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree_level {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree_level() {
		this.root = Create_tree();
	}

	public Node Create_tree() {
		int item = sc.nextInt();
		Node node = new Node();
		node.data = item;
		this.root = node;
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			Node nn = queue.removeFirst();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				node = new Node();
				node.data = c1;
				nn.left = node;
				queue.add(nn.left);
			} else {
				nn.left = null;
			}
			if (c2 != -1) {
				node = new Node();
				node.data = c2;
				nn.right = node;
				queue.add(nn.right);
			} else {
				nn.right = null;
			}
		}
		return this.root;

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

	static int max_visit = -1;

	public void left_view() {
		left_view(this.root, 0);
	}

	private void left_view(Node node, int level) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		if (max_visit < level) {
			System.out.print(node.data + " ");
			max_visit=level;
		}
		left_view(node.left, level + 1);
		left_view(node.right, level + 1);

	}

}
