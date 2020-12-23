package com.company.graph;

import java.util.*;

public class FindRoundTrip {

    public static void main(String[] args) {
        Trip trip1 = new Trip("Cologne", "Berlin");
        Trip trip2 = new Trip("Munich", "Cologne");
        Trip trip3 = new Trip("Chennai", "Munich");
        Trip trip4 = new Trip("Berlin", "Chennai");

        List<Trip> trips = Arrays.asList(trip2, trip1, trip3,trip4);
        Graph graph = new Graph();
        for (Trip trip : trips) {
            graph.addVertex(trip.getStart());
            graph.addVertex(trip.getEnd());
            graph.addEdge(trip.getStart(),trip.getEnd());
//            System.out.println("vertex  " + trip.getStart() + "   " +graph.getAdjVertices(trip.getStart()).get(0).getTrip());
        }
        System.out.println(graph.printGraph());
        System.out.println(depthFirstTraversal(graph,"Cologne"));

        LinkedList linkedList[] = new LinkedList[5];
        //System.out.println(graph);
//        Map<String, Integer> destinations = new HashMap<>();
//        Map<String, Integer> origin = new HashMap<>();
//        trips.forEach(trip -> {
//            origin.put(trip.start, 1);
//            int count = origin.containsKey(trip.end) ? origin.get(trip.end) + 1 : 1;
//            destinations.put(trip.end, count);
//        });
//
//        System.out.println(destinations);
//        System.out.println(origin);
//        System.out.println(destinations.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue() == 1).findFirst().get());
    }

    static Set<String> depthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        String destination = "";
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                /*if(graph.getAdjVertices(vertex) != null && graph.getAdjVertices(vertex).size() > 0){
                    //System.out.println("vertex  " + vertex + "   " +graph.getAdjVertices(vertex).get(0).getTrip());
                    stack.push(graph.getAdjVertices(vertex).get(0).getTrip());
                } else {
                    destination = vertex;
                }*/
                for (Vertex v : graph.getAdjVertices(vertex)) {
                    stack.push(v.getTrip());
                }
            }
        }
        return visited;
    }

    static Set<String> breadthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : graph.getAdjVertices(vertex)) {
                if (!visited.contains(v.getTrip())) {
                    visited.add(v.getTrip());
                    queue.add(v.getTrip());
                }
            }
        }
        return visited;
    }
}
