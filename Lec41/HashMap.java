package Lec41;

import java.util.ArrayList;

public class HashMap<K, V> {
	private class Node {
		K Key;
		V Value;
		Node next;

		public Node(K Key, V value) {
			// TODO Auto-generated constructor stub
			this.Key = Key;
			this.Value = value;
		}

	}

	int size = 0;
	ArrayList<Node> bucketar;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public HashMap(int bucketsize) {
		// TODO Auto-generated constructor stub
		bucketar = new ArrayList<>();
		for (int i = 0; i < bucketsize; i++) {
			bucketar.add(null);
		}

	}

	public int hashFunction(K key) {
		int bn = key.hashCode() % bucketar.size();
		return bn;
	}

	public void put(K key, V Value) {
		int bn = hashFunction(key);
		Node temp = bucketar.get(bn);
		while (temp != null) {
			if (temp.Key.equals(key)) {
				temp.Value = Value;
				return;
			}
			temp = temp.next;
		}
		temp = bucketar.get(bn);
		Node node = new Node(key, Value);
		node.next = temp;
		bucketar.set(bn, node);
		size++;
		int loadfactor = size / bucketar.size();
		int TH = 2;

		if (loadfactor > TH) {
			rehash();
		}

	}

	public V get(K Key) {
		int bn = hashFunction(Key);
		Node temp = bucketar.get(bn);
		while (temp != null) {
			if (temp.Key.equals(Key)) {
				return temp.Value;
			}
			temp = temp.next;
		}
		return null;

	}

	public boolean containsKey(K Key) {
		int bn = hashFunction(Key);
		Node temp = bucketar.get(bn);
		while (temp != null) {
			if (temp.Key.equals(Key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V remove(K Key) {
		int bn = hashFunction(Key);
		Node temp = bucketar.get(bn);
		Node prev = null;
		while (temp != null) {
			if (temp.Key.equals(Key)) {
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return null;
		}
		size--;
		if (prev == null) {
			bucketar.set(bn, temp.next);
			return temp.Value;
		}
		prev.next = temp.next;
		return temp.Value;

	}

	public void rehash() {
		ArrayList<Node> oba = this.bucketar;
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * this.bucketar.size(); i++) {
			nba.add(null);
		}
		this.bucketar = nba;
		this.size = 0;
		for (Node temp : oba) {
			Node node = temp;
			while (node != null) {

				put(node.Key, node.Value);
				node = node.next;

			}

		}
	}

	public String toString() {
		String s = "[";
		for (Node node : this.bucketar) {
			while (node != null) {
				s += node.Key + "=" + node.Value + " ";
				node = node.next;

			}

		}
		return s + "]";
	}

}
