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
			if (rn1 == rn2) {
				return;
			} else {
				if (rn1.rank > rn2.rank) {
					rn2.parent = rn1;
				} else if (rn1.rank < rn2.rank) {
					rn1.parent = rn2;
				} else {
					rn1.parent = rn2;
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
			return rr;
		}
	}

	private class EdgePair {
		int v1;
		int v2;
		int cost;

		public EdgePair(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}

		public String toString() {
			return this.v1 + " - " + this.v2 + " @ " + this.cost;
		}
	}

	private ArrayList<EdgePair> getAllEdge() {
		ArrayList<EdgePair> ll = new ArrayList<>();
		for (int vtx : map.keySet()) {
			for (int nbrs : map.get(vtx).keySet()) {
				EdgePair eg = new EdgePair(vtx, nbrs, map.get(vtx).get(nbrs));
				ll.add(eg);
			}
		}
		return ll;

	}

	public void KruskalS() {
		DisjoinSet ds = new DisjoinSet();
		for (int vertex : map.keySet()) {
			ds.Create(vertex);
		}
		ArrayList<EdgePair> edgepair = getAllEdge();
		Collections.sort(edgepair, new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		for (EdgePair e : edgepair) {
			int re1 = ds.find(e.v1);
			int re2 = ds.find(e.v2);
			if (re1 != re2) {
				System.out.println(e);
				ds.union(e.v1, e.v2);
			}

		}

	}

	private class PrimsPair {
		int vname;
		int acq;
		int cost;

		public PrimsPair(int vname, int acq, int cost) {
			// TODO Auto-generated constructor stub
			this.vname = vname;
			this.acq = acq;
			this.cost = cost;
		}

		public String toString() {
			return this.vname + " via " + this.acq + " @ " + this.cost;
		}

	}

	public void prims() {
		HashSet<Integer> visited = new HashSet<Integer>();
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			PrimsPair p = pq.remove();
			// Ignore
			if (visited.contains(p.vname)) {
				continue;
			}
			visited.add(p.vname);
			if (p.cost != 0)
				System.out.println(p);
			for (int nbrs : map.get(p.vname).keySet()) {
				PrimsPair np = new PrimsPair(nbrs, p.vname, map.get(p.vname).get(nbrs));
				pq.add(np);
			}
		}
	}

	private class DijkstraPair implements Comparable<DijkstraPair> {
		int vname;
		String psf;
		int cost;

		public DijkstraPair(int vname,String psf, int cost) {
			// TODO Auto-generated constructor stub
			this.vname = vname;
			this.psf = psf;
			this.cost = cost;
		}

		public String toString() {
			return this.vname + " via " + this.psf + " @ " + this.cost;
		}

		@Override
		public int compareTo(DijkstraPair o) {
			// TODO Auto-generated method stub
			return this.cost-o.cost;
		}

	}
	public void Dijkstra() {
		HashSet<Integer> visited = new HashSet<Integer>();
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>();
		pq.add(new DijkstraPair(1, "", 0));
		while (!pq.isEmpty()) {
			DijkstraPair p = pq.remove();
			// Ignore
			if (visited.contains(p.vname)) {
				continue;
			}
			visited.add(p.vname);
			if (p.cost != 0)
				System.out.println(p);
			for (int nbrs : map.get(p.vname).keySet()) {
				DijkstraPair np = new DijkstraPair(nbrs, p.psf+p.vname, p.cost+map.get(p.vname).get(nbrs));
				pq.add(np);
			}
		}
	}


}
