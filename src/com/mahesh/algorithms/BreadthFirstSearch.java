package com.mahesh.algorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        /*g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);*/

        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 0)");

        g.breadthFirstSearch(2);
    }
}


class Graph {
    Integer vertex;
    LinkedList<Integer> adjacency[];

    public Graph(int vertex) {
        this.vertex = vertex;
        adjacency = new LinkedList[vertex];
        for(int i=0;i< vertex;i++) {
            adjacency[i] = new LinkedList<>();
        }

    }

    void addEdge(int v,int w)
    {
        adjacency[v].add(w);
        adjacency[w].add(v);
    }

    void breadthFirstSearch(int start) {
        boolean[] visited = new boolean[vertex];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(queue.size() != 0) {
            start = queue.poll();
            System.out.println(start+" ");

            Iterator<Integer> vertexes = adjacency[start].iterator();
            while(vertexes.hasNext()) {
                int next = vertexes.next();;
                if (!visited[next])
                {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }


    }

}