package com.mahesh.algorithms;

import java.util.HashMap;
import java.util.Map;

public class DepthFirstSearch {
    public static void main(String[] args) {
        Map<String, String[]> graph = new HashMap<>();

        graph.put("A", new String[]{"B", "C"});
        graph.put("B", new String[]{"A", "D", "E"});
        graph.put("C", new String[]{"A", "F"});
        graph.put("D", new String[]{"B"});
        graph.put("E", new String[]{"B", "F"});
        graph.put("F", new String[]{"C", "E"});

        Map<String, Boolean> visited = new HashMap<>();

        for(String vertex: graph.keySet()) {
            if(!visited.containsKey(vertex)) {
                depthFirst(vertex, graph, visited);
            }
        }
    }

    private static void depthFirst(String vertex, Map<String, String[]> graph, Map<String, Boolean> visited) {
        visited.put(vertex, true);
        System.out.println("Visited "+vertex);

        for(String neighbour: graph.get(vertex)){
            if(!visited.containsKey(neighbour)) {
                depthFirst(neighbour, graph,visited);
            }
        }
    }
}
