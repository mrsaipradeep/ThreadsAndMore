package com.company.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;

    void addVertex(String trip) {
        adjVertices.putIfAbsent(new Vertex(trip), new ArrayList<>());
    }
    Graph() {
        this.adjVertices = new HashMap<>();
    }
    void removeVertex(String trip) {
        Vertex v = new Vertex(trip);
        adjVertices.values()
                .stream()
                .map(e -> e.remove(v))
                .collect(Collectors.toList());
        adjVertices.remove(new Vertex(trip));
    }

    void addEdge(String trip1, String trip2) {
        Vertex v1 = new Vertex(trip1);
        Vertex v2 = new Vertex(trip2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    void removeEdge(String trip1, String trip2) {
        Vertex v1 = new Vertex(trip1);
        Vertex v2 = new Vertex(trip2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

    List<Vertex> getAdjVertices(String trip) {
        return adjVertices.get(new Vertex(trip));
    }

    String printGraph() {
        StringBuffer sb = new StringBuffer();
        for(Vertex v : adjVertices.keySet()) {
            sb.append(v);
            sb.append(adjVertices.get(v));
        }
        return sb.toString();
    }

}
