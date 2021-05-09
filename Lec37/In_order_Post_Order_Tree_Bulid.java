package Lec37;

public class In_order_Post_Order_Tree_Bulid {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public In_order_Post_Order_Tree_Bulid(int[] in, int[] post) {
		// TODO Auto-generated constructor stub
		this.root = Create_node(post, 0, post.length - 1, in, 0, in.length - 1);
	}

	private Node Create_node(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
		// TODO Auto-generated method stub
		if (ilo > ihi || plo > phi) {
			return null;
		}
		Node node = new Node();
		node.data = post[phi];
		int idx = search_index(in, ilo, ihi, post[phi]);
		node.left = Create_node(post, plo, plo - ilo + idx - 1, in, ilo, idx - 1);
		node.right = Create_node(post, phi - ihi + idx, phi - 1, in, idx + 1, ihi);
		return node;

	}

	private int search_index(int in[], int si, int ei, int item) {
		int idx = -1;
		for (int i = si; i <= ei; i++) {
			if (in[i] == item) {
				idx = i;
				return idx;
			}
		}
		return idx;
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

	private Node Lowes_Common_Ancestor(Node root, Node p, Node q) {
		if (root == null) {
			return root;
		}
		if (root == p || root == q) {
			return root;
		}
		Node left = Lowes_Common_Ancestor(root.left, p, q);
		Node right = Lowes_Common_Ancestor(root.right, p, q);
		if (left != null && right != null) {
			return root;
		} else if (left != null) {
			return left;
		} else
			return right;

	}

	private Node Lowes_Common_AncestorIII(Node p, Node q) {
		if (root == null) {
			return root;
		}
		if(is_cover(p, q)) {
			return p;
		}
		if(is_cover(q, p)) {
			return q;
		}
		return Lowes_Common_AncestorIII( p.parent, q.parent);

	}

	public boolean is_cover(Node p, Node q) {

		if (p == null) {
			return false;
		}
		if (p == q) {
			return true;
		}
		return is_cover(p.left, q) || is_cover(p.right, q);

	}
}
