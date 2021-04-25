package Lec32;

public class Client_GenricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTree gt = new GenericTree();
		gt.Display();
		System.out.println(gt.szie());
		System.out.println(gt.ht());
		System.out.println(gt.max());
		System.out.println(gt.find(700));
		System.out.println(">>>>>>>>>>>");
		gt.perOrder();
		System.out.println(">>>>>>>>>>>");
		gt.postOrder();
		System.out.println(">>>>>>>>>>>");
		gt.levelOrder();
		System.out.println(">>>>>>>>>>>>>");
		gt.printlevelwise();
		System.out.println(">>>>>>>>>>>>>>");
//		gt.mirror();
		gt.linearize();
		gt.Display();
// 10 3 20 2 50 0 60 0 30 0 40 1 70 0
	}

}
