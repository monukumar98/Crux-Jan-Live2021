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

	public Linkedlist() {
		// TODO Auto-generated constructor stub
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public Linkedlist(Node head_node, Node tail_node, int size) {
		// TODO Auto-generated constructor stub
		this.head = head_node;
		this.tail = tail_node;
		this.size = size;
	}

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

	public void ReverseDataI() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node Left_node = getNode(left);
			Node right_node = getNode(right);
			int t = Left_node.data;
			Left_node.data = right_node.data;
			right_node.data = t;
			left++;
			right--;
		}

	}

	public void ReversePointerI() throws Exception {
		Node prev = this.head;
		Node curr = this.head.next;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		// head and tail swapping
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;

	}

	public void ReversePointerRecursive() {

		ReversePointerRecursive(this.head, this.head.next);
		// head and tail swapping
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void ReversePointerRecursive(Node left, Node right) {
		if (right == null) {
			return;
		}

		ReversePointerRecursive(left.next, right.next);
		right.next = left;

	}

	public void ReverseDataRecursive() {
		HeapMover mover = new HeapMover(this.head);
		ReverseDataRecursive(mover, this.head, 0);
	}

	private void ReverseDataRecursive(HeapMover mover, Node right, int count) {
		if (right == null) {
			return;
		}

		ReverseDataRecursive(mover, right.next, count + 1);
		if (count >= this.size / 2) {
			int t = mover.node.data;
			mover.node.data = right.data;
			right.data = t;
			mover.node = mover.node.next;
		}

	}

	private class HeapMover {
		private Node node;

		public HeapMover(Node node) {
			// TODO Auto-generated constructor stub
			this.node = node;

		}

	}

	public Linkedlist merge(Linkedlist other) {
		Node node1 = this.head;
		Node node2 = other.head;
		Linkedlist temp = new Linkedlist();
		while (node1 != null && node2 != null) {
			if (node1.data <= node2.data) {
				temp.addlast(node1.data);
				node1 = node1.next;
			} else {
				temp.addlast(node2.data);
				node2 = node2.next;
			}
		}
		while (node1 != null) {
			temp.addlast(node1.data);
			node1 = node1.next;
		}
		while (node2 != null) {
			temp.addlast(node2.data);
			node2 = node2.next;
		}
		this.head = temp.head;
		this.tail = temp.tail;
		this.size = temp.size;
		return this;
	}

	public int mid() {
		return Get_mid().data;

	}

	private Node Get_mid() {

		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public void meregsort() {
		Linkedlist ll = MergeHelper();
		this.head = ll.head;
		this.size = ll.size;
		this.tail = ll.tail;
	}

	private Linkedlist MergeHelper() {
		// TODO Auto-generated method stub
		if (this.size == 1) {
			return new Linkedlist(this.head, this.tail, 1);
		}
		Node mid = this.Get_mid();
		Node midnext = mid.next;
		mid.next = null;
		Linkedlist fs = new Linkedlist(this.head, mid, (this.size + 1) / 2);
		Linkedlist ss = new Linkedlist(midnext, this.tail, this.size / 2);
		fs = fs.MergeHelper();
		ss = ss.MergeHelper();
		return fs.merge(ss);

	}

	public void CreateCycle() throws Exception {
		// this.tail.next=this.head;
		this.tail.next = this.getNode(2);

	}

	public boolean FlodCycleDection() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {

			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}

		}
		return false;
	}

	private Node GetCycleNode() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {

			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return fast;
			}

		}
		return null;
	}

	public void Cycleremove1() {

		Node node = GetCycleNode();// 7
		if (node == null) {
			return;
		}
		Node temp = this.head;
		while (temp != null) {

			Node nn = node;// 7k
			while (nn.next != node) {
				if (nn.next == temp) {
					nn.next = null;
					return;
				}
				nn = nn.next;
			}
			temp = temp.next;

		}
	}

	public void Cycleremove2() {

		Node node = GetCycleNode();// 7k
		if (node == null) {
			return;
		}

		Node nn = node;// 7k
		int c = 1;
		while (nn.next != node) {

			c++;
			nn = nn.next;
		}

		Node fast = this.head;
		for (int i = 1; i <= c; i++) {

			fast = fast.next;
		}

		Node start = this.head;
		while (start.next != fast.next) {

			fast = fast.next;
			start = start.next;
		}
		fast.next = null;
	}

	public void FloydCycleRemoval() {
		Node node = GetCycleNode();// 7k
		if (node == null) {
			return;
		}
		Node start = head;
		Node fast = node;
		while (start.next != fast.next) {
			fast = fast.next;
			start = start.next;
		}
		fast.next = null;
	}

	public void Reverse_Nodes_in_k_Group(int k) throws Exception {
		Linkedlist prev = new Linkedlist();
		while (this.size != 0) {
			Linkedlist curr = new Linkedlist();

			for (int i = 0; i < k && this.size != 0; i++) {
				curr.addfirst(this.removeFirst());

			}
			if (prev.size == 0) {
				prev.head = curr.head;
				prev.tail = curr.tail;
				prev.size = curr.size;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}
		}
		this.head = prev.head;
		this.tail = prev.tail;
		this.size = prev.size;
	}

//O(1)
	public int size() {
		return this.size;
	}
}
