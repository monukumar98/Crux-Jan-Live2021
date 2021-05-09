package Lec35;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree(null, false);

	}

	private Node CreateTree(Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("Enter data for root node");
		} else if (ilc) {
			System.out.println("Enter data  for  left child  of" + parent.data);

		} else {
			System.out.println("Enter data  for  right child  of " + parent.data);
		}
		int item = sc.nextInt();
		Node node = new Node();
		node.data = item;
		node.left = null;
		node.right = null;
		System.out.println("has left chid ?? " + node.data);
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			node.left = CreateTree(node, true);
		}
		System.out.println("has right chid ?? " + node.data);
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			node.right = CreateTree(node, false);
		}
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

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}
		int ls = size(node.left);
		int rs = size(node.right);
		return ls + rs + 1;
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

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lm = max(node.left);
		int rm = max(node.right);
		return Math.max(lm, Math.max(rm, node.data));
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);
		return lf || rf;
	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.data + " ");
	}

	public void InOrder() {
		InOrder(this.root);
		System.out.println();
	}

	private void InOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		InOrder(node.left);
		System.out.print(node.data + " ");
		InOrder(node.right);
	}

	public void levelOrder() {
		// TODO Auto-generated method stub
		LinkedList<Node> Queue = new LinkedList<>();
		Queue.add(this.root);
		while (!Queue.isEmpty()) {
			Node rn = Queue.removeFirst();
			System.out.print(rn.data + " ");
			if (rn.left != null) {
				Queue.add(rn.left);
			}
			if (rn.right != null) {
				Queue.add(rn.right);
			}
		}
		System.out.println();

	}

	public void levelOrderlevelwise() {
		// TODO Auto-generated method stub
		LinkedList<Node> Queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();
		Queue.add(this.root);
		while (!Queue.isEmpty()) {
			Node rn = Queue.removeFirst();
			System.out.print(rn.data + " ");
			if (rn.left != null) {
				helper.add(rn.left);
			}
			if (rn.right != null) {
				helper.add(rn.right);
			}
			if (Queue.isEmpty()) {
				Queue = helper;
				helper = new LinkedList<>();
				System.out.println();
			}
		}

	}

	public void ZigZagLevelOrder() {
		LinkedList<Node> Queue = new LinkedList<>();
		LinkedList<Node> stack = new LinkedList<>();
		Queue.add(this.root);
		int level = 0;
		while (!Queue.isEmpty()) {
			Node rn = Queue.removeFirst();
			System.out.print(rn.data + " ");
			if (level % 2 == 0) {
				if (rn.left != null) {
					stack.addFirst(rn.left);
				}
				if (rn.right != null) {
					stack.addFirst(rn.right);
				}
			} else {
				if (rn.right != null) {
					stack.addFirst(rn.right);
				}
				if (rn.left != null) {
					stack.addFirst(rn.left);
				}
			}

			if (Queue.isEmpty()) {
				level++;
				Queue = stack;
				stack = new LinkedList<>();
				System.out.println();
			}
		}

	}

	public int diameter() {
		return diameter(this.root);
	}

	private int diameter(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}
		int ld = diameter(node.left);
		int rd = diameter(node.right);
		int sd = ht(node.left) + ht(node.right) + 2;
		return Math.max(rd, Math.max(ld, sd));
	}

	private class Diapair {
		int ht = -1;
		int diameter = 0;;
	}

	public int diameter2() {
		return diameter2(this.root).diameter;
	}

	private Diapair diameter2(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return new Diapair();
		}
		Diapair ldp = diameter2(node.left);
		Diapair rdp = diameter2(node.right);
		Diapair sdp = new Diapair();
		int ld = ldp.diameter;// left
		int rd = rdp.diameter;// right
		int sd = ldp.ht + rdp.ht + 2;// self
		sdp.diameter = Math.max(ld, Math.max(rd, sd));
		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
		return sdp;

	}

	public boolean isblanced() {
		return isblanced(this.root);
	}

	private boolean isblanced(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return true;
		}
		boolean lb = isblanced(node.left);
		boolean rb = isblanced(node.right);
		int bf = Math.abs(ht(node.left) - ht(node.right));
		if (lb && rb && bf <= 1) {
			return true;
		}
		return false;
	}

	public boolean flipEquiv(BinaryTree other) {
		return flipEquiv(this.root, other.root);

	}

	private boolean flipEquiv(Node node1, Node node2) {
		// TODO Auto-generated method stub
		if (node1 == null && node2 == null) {
			return true;
		}
		if (node1 == null || node2 == null) {
			return false;
		}
		if (node1.data != node2.data) {
			return false;
		}
		boolean flip = flipEquiv(node1.left, node2.right) && flipEquiv(node1.right, node2.left);
		boolean Noflip = flipEquiv(node1.left, node2.left) && flipEquiv(node1.right, node2.right);

		return flip || Noflip;
	}

	public boolean Is_Bst() {
		return Is_Bst(this.root);
	}

	private boolean Is_Bst(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return true;
		}

		boolean lbst = Is_Bst(node.left);
		boolean rbst = Is_Bst(node.right);
		boolean sbst = max(node.left) < node.data && node.data < min(node.right);
		if (lbst && rbst && sbst) {
			return true;
		}
		return false;
	}

	private class BstPair {
		boolean is_bst=true;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int ans = 0;
		int size = 0;

	}

	public boolean Is_Bst2() {
		return Is_Bst2(this.root).is_bst;
	}

	private BstPair Is_Bst2(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return new BstPair();
		}
		BstPair lbstp = Is_Bst2(node.left);
		BstPair rbstp = Is_Bst2(node.right);
		BstPair sbstp = new BstPair();
		if (lbstp.is_bst && rbstp.is_bst && lbstp.max < node.data && rbstp.min > node.data) {
			sbstp.is_bst = true;
			sbstp.min = Math.min(lbstp.min, Math.min(rbstp.min, node.data));
			sbstp.max = Math.max(lbstp.max, Math.max(rbstp.max, node.data));

		}
		sbstp.is_bst = false;
		return sbstp;

	}

	public int min() {
		return min(this.root);
	}

	private int min(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int lm = min(node.left);
		int rm = min(node.right);
		return Math.min(lm, Math.min(rm, node.data));
	}

	public int BtinBst() {
		return BtinBst(this.root).ans;
	}

	private BstPair BtinBst(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return new BstPair();
		}
		BstPair lbstp = BtinBst(node.left);
		BstPair rbstp = BtinBst(node.right);
		BstPair sbstp = new BstPair();
		sbstp.size = lbstp.size + rbstp.size+1;
		if (lbstp.is_bst && rbstp.is_bst && lbstp.max < node.data && rbstp.min > node.data) {
			sbstp.min = Math.min(lbstp.min, Math.min(rbstp.min, node.data));
			sbstp.max = Math.max(lbstp.max, Math.max(rbstp.max, node.data));
			sbstp.ans = sbstp.size;
			sbstp.is_bst = true;
			return sbstp;

		}
		sbstp.ans=Math.max(lbstp.ans,rbstp.ans);
		sbstp.is_bst=false;
		return sbstp;
		

	}

}
