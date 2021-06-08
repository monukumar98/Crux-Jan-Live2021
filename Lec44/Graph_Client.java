package Lec44;

import java.util.HashSet;

public class Graph_Client {
	public static void main(String[] args) {
		Graph g = new Graph(7);
		g.addEdge(1, 2, 1);
		g.addEdge(2,3, 5);
		g.addEdge(3,4, 7);
		g.addEdge(1,4, 2);
		g.addEdge(5,4, 8);
		g.addEdge(5,6, 6);
		g.addEdge(5,7, 3);
		g.addEdge(6,7, 4);
		g.Display();
//	    g.removeEdge(4, 5);
//	    g.removeEdge(1, 2);
//	    g.removeEdge(2, 3);
//	    g.removeEdge(6, 7);
		System.out.println(g.hasPath(1, 6, new HashSet<>()));
		g.PrintAllPath(1, 6,new HashSet<>(), "");
		System.out.println(g.BFS(1, 6));
		System.out.println(g.DFS(1, 6));
		g.BFT();
		g.DFT();
		System.out.println(g.IsCycle());
		System.out.println(g.IsConnected());
		System.out.println(g.IsTree());
		System.out.println(g.GetConnectedCompnent());
		g.KruskalS();
		g.prims();
		System.out.println();
		g.Dijkstra();
	
	

}
}