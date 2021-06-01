package Lec44;

import java.util.*;

public class Graph {
	private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Graph(int v) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public int noofEdge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum += map.get(key).size();
		}
		return sum / 2;
	}

	public int noofvertex() {
		return map.size();
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}

	}

	public void removevertex(int v1) {
		if (map.containsKey(v1)) {
			for (int nbrs : map.get(v1).keySet()) {
				map.get(nbrs).remove(v1);
			}
			map.remove(v1);
		}
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);

	}

	public void addvtx(int v1) {
		map.put(v1, new HashMap<>());
	}

	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);

	}

	public void Display() {
		for (int key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}

	public boolean hasPath(int src, int dis, HashSet<Integer> visited) {

		if (src == dis) {
			return true;
		}
		visited.add(src);
		for (int nbbrs : map.get(src).keySet()) {

			if (!visited.contains(nbbrs)) {
				boolean res = hasPath(nbbrs, dis, visited);
				if (res) {
					return res;
				}
			}
		}
		return false;
	}

	public void PrintAllPath(int src, int dis, HashSet<Integer> visited, String str) {
		if (src == dis) {
			System.out.println(str + dis);
		}
		visited.add(src);
		for (int nbbrs : map.get(src).keySet()) {

			if (!visited.contains(nbbrs)) {
				PrintAllPath(nbbrs, dis, visited, str + src + " ");

			}
		}
		visited.remove(src);

	}

	public boolean BFS(int src, int dis) {
		HashSet<Integer> visited = new HashSet<Integer>();

		LinkedList<Integer> q = new LinkedList<>();
		q.add(src);
		while (!q.isEmpty()) {
			int rv = q.removeFirst();
			// Already Visited
			if (visited.contains(rv)) {
				continue;
			}
			// src==dis
			if (rv == dis) {
				return true;
			}

			visited.add(rv);

			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;

	}

	public boolean DFS(int src, int dis) {
		HashSet<Integer> visited = new HashSet<Integer>();

		Stack<Integer> s = new Stack<>();
		s.push(src);
		while (!s.isEmpty()) {
			int rv = s.pop();
			// Already Visited
			if (visited.contains(rv)) {
				continue;
			}
			// src==dis
			if (rv == dis) {
				return true;
			}

			visited.add(rv);

			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					s.push(nbrs);
				}
			}
		}
		return false;

	}

	public void BFT() {
		HashSet<Integer> visited = new HashSet<Integer>();

		LinkedList<Integer> q = new LinkedList<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.removeFirst();
				// Already Visited
				if (visited.contains(rv)) {
					continue;
				}
				System.out.print(rv + " ");

				visited.add(rv);

				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}

		}
		System.out.println();
	}

	public void DFT() {
		HashSet<Integer> visited = new HashSet<Integer>();

		Stack<Integer> s = new Stack<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			s.push(src);
			while (!s.isEmpty()) {
				int rv = s.pop();
				// Already Visited
				if (visited.contains(rv)) {
					continue;
				}
				System.out.print(rv + " ");

				visited.add(rv);

				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}
		}
		System.out.println();

	}

	public boolean IsCycle() {
		HashSet<Integer> visited = new HashSet<Integer>();

		LinkedList<Integer> q = new LinkedList<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.removeFirst();
				// Already Visited
				if (visited.contains(rv)) {
					return true;
				}

				visited.add(rv);

				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}

		}
		return false;
	}

	public boolean IsConnected() {
		HashSet<Integer> visited = new HashSet<Integer>();

		Stack<Integer> s = new Stack<>();
		int compnent = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			compnent++;
			s.push(src);
			while (!s.isEmpty()) {
				int rv = s.pop();
				// Already Visited
				if (visited.contains(rv)) {
					continue;
				}

				visited.add(rv);

				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}
		}
		return compnent == 1;

	}

	public boolean IsTree() {
		return IsConnected() && !IsCycle();
	}

	public ArrayList<ArrayList<Integer>> GetConnectedCompnent() {
		HashSet<Integer> visited = new HashSet<Integer>();
		ArrayList<ArrayList<Integer>> bl = new ArrayList<>();
		Stack<Integer> s = new Stack<>();
		int compnent = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			compnent++;
			ArrayList<Integer> sl = new ArrayList<Integer>();
			bl.add(sl);
			s.push(src);
			while (!s.isEmpty()) {
				int rv = s.pop();
				// Already Visited
				if (visited.contains(rv)) {
					continue;
				}

				visited.add(rv);
				sl.add(rv);
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}
		}
		return bl;

	}

	private class DisjoinSet {
		private class Node {
			int data;
			int rank;
			Node parent;

			public Node(int data, int rank) {
				// TODO Auto-generated constructor stub
				this.data = data;
				this.rank = rank;

			}

		}

		private HashMap<Integer, Node> mapping = new HashMap<>();

		public void Create(int value) {
			Node nn = new Node(value, 0);
			nn.parent = nn;
			mapping.put(value, nn);

		}

		public void union(int value1, int value2) {
			Node nn1 = mapping.get(value1);
			Node nn2 = mapping.get(value2);
			Node rn1 = find(nn1);
			Node rn2 = find(nn2);
			if(rn1==rn2) {
				return;
			}
			else {
				if(rn1.rank>rn2.rank) {
					rn2.parent=rn1;
				}
				else if(rn1.rank<rn2.rank) {
					rn1.parent=rn2;
				}
				else {
					rn1.parent=rn2;
					rn2.rank++;
				}
			}

		}

		public int find(int value) {

			Node node = mapping.get(value);
			return find(node).data;

		}

		public Node find(Node node) {
			if (node.parent == node) {
				return node;
			}

			Node rr = find(node.parent);
			    node.parent=rr;
			return rr;
		}
	}

}
