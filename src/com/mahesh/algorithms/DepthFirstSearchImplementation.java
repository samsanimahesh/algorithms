package com.mahesh.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearchImplementation {
    public static void main(String[] args) {
        List<Edge> edges  = Arrays.asList(
                // Notice that node 0 is unconnected
                new Edge(1, 2), new Edge(1, 7), new Edge(1, 8), new Edge(2, 3),
                new Edge(2, 6), new Edge(3, 4), new Edge(3, 5), new Edge(8, 9),
                new Edge(8, 12), new Edge(9, 10), new Edge(9, 11)
        );

        int n = 13;

        // build a graph from the given edges
        DfsGraph graph = new DfsGraph(edges, n);
        boolean[] discovered = new boolean[n];

        for(int i=0;i<n;i++) {
            if(!discovered[i] ) {
                dfs(graph, i ,discovered);
            }
        }



    }

    private static void dfs(DfsGraph graph, int vertex, boolean[] discovered) {
        discovered[vertex] = true;
        System.out.println("Vertex traversed is "+vertex);
        for (int u: graph.adjacencyList.get(vertex))
        {
            // if `u` is not yet discovered
            if (!discovered[u]) {
                dfs(graph, u, discovered);
            }
        }
    }
}

class DfsGraph {
    List<List<Integer>> adjacencyList = new ArrayList<>();

    DfsGraph(List<Edge> edges, int n) {
        for(int i=0;i<n;i++){
            adjacencyList.add(new ArrayList<>());
        }

        for(Edge edge: edges) {
            adjacencyList.get(edge.source).add(edge.destination);
            adjacencyList.get(edge.destination).add(edge.source);
        }
    }
}

class Edge{
    int source;
    int destination;

    public Edge(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }
}
