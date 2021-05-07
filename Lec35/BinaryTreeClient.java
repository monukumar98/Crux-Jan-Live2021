package Lec35;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.display();
		System.out.println(bt.size());
		System.out.println(bt.max());
		System.out.println(bt.ht());
		System.out.println(bt.find(40));
		System.out.println(">>>>>>>>>>>>>>>>>>");
		bt.PreOrder();
		System.out.println(">>>>>>>>>>>>>>>>>>");
		bt.PostOrder();
		System.out.println(">>>>>>>>>>>>>>>>>>");
		bt.InOrder();
		System.out.println(">>>>>>>>>>>>>>>>>>");
		bt.levelOrder();
		System.out.println(">>>>>>>>>>>>>>>>>>");
		bt.levelOrderlevelwise();
		

	}
// 10 true 20 true 50 false true 60 false false false true 30 false true 70 true 40 false false false
}
