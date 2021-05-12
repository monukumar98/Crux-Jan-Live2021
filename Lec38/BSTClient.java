package Lec38;

public class BSTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = {35,45,48,50,60,70,71};
		BinarySearchTree bst = new BinarySearchTree(in);
		bst.display();
		System.out.println(bst.find(60));
		System.out.println(bst.max());
		System.out.println(bst.ht());
		bst.addNode(36);
		bst.display();
		bst.deleteNode(50);
		System.out.println(">>>>>>>>>>>>>>>");
		bst.display();


	}

}
