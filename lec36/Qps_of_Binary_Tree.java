package lec36;

import Lec35.BinaryTree;

public class Qps_of_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.display();
		bt.levelOrderlevelwise();
		System.out.println(">>>>>>>>>>>>>");
		bt.ZigZagLevelOrder();
		System.out.println(bt.diameter());
		System.out.println(bt.diameter2());
		System.out.println(bt.isblanced());
		BinaryTree bt1 = new BinaryTree();
		System.out.println(bt.flipEquiv(bt1));
	}

}
