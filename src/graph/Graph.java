package graph;

import java.util.LinkedList;
import java.util.List;


public class Graph {
	
	private LinkedList[] list = new LinkedList[5];
	
	
	public Graph(int noOfvertexes){
		for(int i=0; i<noOfvertexes;i++) {
			list[i] = new LinkedList();
		}
	}
	
	
	public void addEdge(Graph graph, int src , int dest) {
		graph.list[src].add(dest);
		graph.list[dest].add(src);
	}
	
	
	
	public void printGraph() {
		
		for(int i=0; i<list.length;i++) {
			
			LinkedList lst = list[i];
			System.out.println("head " + i); 	
 			for(int j=0; j<lst.size(); j++ ) {
				System.out.print("--->"+lst.get(j));
			}
 		System.out.println("\n"); 
		}
		
	}
	
}
