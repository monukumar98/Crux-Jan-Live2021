package Lec29;

public class Linkedlist {
	private class Node {
		int data;
		Node next;

		public Node() {
			// TODO Auto-generated constructor stub
			this.data = 0;
			this.next = null;
		}

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;
	private int size = 0;

	// O(n)
	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	// O(1)
	public void addlast(int item) {
		Node node = new Node(item); // 1k
		if (this.size == 0) {
			this.head = node;
			this.tail = node;
			this.size++;
		} else {
			this.tail.next = node;
			this.tail = node;
			this.size++;
		}

	}

// O(1)
	public void addfirst(int item) {

		if (this.size == 0) {
			addlast(item);
		} else {
			Node node = new Node(item); // 5k
			node.next = this.head;
			this.head = node;
			this.size++;
		}

	}

	public void addatindex(int k, int item) throws Exception {
		if (k < 0 || k > this.size()) {
			throw new Exception("Invaild Index");
		}
		if (k == 0) {
			addfirst(item);
		} else if (k == this.size) {
			addlast(item);
		} else {
			Node prev = getNode(k - 1);// 2k
			Node prev_next = prev.next;// 3k
			Node node = new Node(item);// 6k
			prev.next = node;
			node.next = prev_next;
			this.size++;
		}
	}

	// O(1)
	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		return this.head.data;
	}

	// O(1)
	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		return this.tail.data;
	}

// O(K)
	public int getatinndex(int k) throws Exception {
		if (k < 0 || k >= this.size()) {
			throw new Exception("Invaild Index");
		}
		if (k == 0) {
			return getFirst();
		} else if (k == this.size() - 1) {
			return getLast();
		} else {
			Node temp = this.head;
			for (int i = 1; i <= k; i++) {
				temp = temp.next;
			}
			return temp.data;
		}

	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= this.size()) {
			throw new Exception("Invaild Index");
		}
		if (k == 0) {
			return this.head;
		} else if (k == this.size - 1) {
			return this.tail;

		} else {
			Node temp = this.head;
			for (int i = 1; i <= k; i++) {
				temp = temp.next;
			}
			return temp;
		}
	}

// O(1)
	public int removeFirst() throws Exception {
		if (this.size() == 0) {
			throw new Exception("LL is Empty");
		}
		int rv = this.head.data;
		Node temp = this.head.next;// 2k
		this.head.next = null;
		this.head = temp;
		this.size--;
		return rv;
	}

// O(N)
	public int removeLast() throws Exception {
		if (this.size() == 0) {
			throw new Exception("LL is Empty");
		}
		if (this.size == 1) {
			return removeFirst();
		} else {
			int rv = this.tail.data;
			Node sl = getNode(this.size() - 2);// 4k
			this.tail = sl;
			this.tail.next = null;
			this.size--;
			return rv;
		}
	}

	public int removeatindex(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (this.size() == 0) {
			throw new Exception("LL is Empty");
		}
		if (k == 0) {
			return removeFirst();
		} else if (k == this.size - 1) {
			return removeLast();
		} else {
			Node temp = getNode(k - 1);// 2k
			// temp.next ---> 3k
			int rv = temp.next.data;
			temp.next = temp.next.next;// 4k
//			Node temp1 = getNode(k);
//			temp.next=temp1.next;
			return rv;
		}

	}

//O(1)
	public int size() {
		return this.size;
	}
}
